package Homework.Day03.NodeBinaryTreeTest;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class Node {
    public int value;
    public Node left;
    public Node right;

    public Node(int value, Node left, Node right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }
}

class BinaryTree {
    private Node root;
    private boolean isFound;

    public BinaryTree(int [] array) {
        Node [] nodeArray = new Node[array.length];
        for (int i = 0; i < array.length; i++) {
            nodeArray[i] = new Node(array[i], null, null);
        }
        for (int i = 0; i < array.length; i++) {
            int left = i * 2 + 1;
            int right = i * 2 + 2;

            if (left < array.length) {
                nodeArray[i].left = nodeArray[left];
            }
            if (right < array.length) {
                nodeArray[i].right = nodeArray[right];
            }
        }
        root = nodeArray[0];
    }

    public void preorder() {
        System.out.println("<<<<PreOrder>>>>");
        System.out.print("[ ");
        preorderHelper(root);
        System.out.println("]");
    }
    private void preorderHelper(Node node){
        System.out.print(node.value + " ");
        if(node.left != null){
            preorderHelper(node.left);
        }
        if(node.right != null){
            preorderHelper(node.right);
        }
    }

    public void inorder() {
        System.out.println("<<<<InOrder>>>>");
        System.out.print("[ ");
        inorderHelper(root);
        System.out.println("]");
    }
    private void inorderHelper(Node node){
        if(node.left != null){
            inorderHelper(node.left);
        }
        System.out.print(node.value + " ");
        if(node.right != null){
            inorderHelper(node.right);
        }
    }

    public void postorder() {
        System.out.println("<<<<PostOrder>>>>");
        System.out.print("[ ");
        postorderHelper(root);
        System.out.println("]");
    }
    private void postorderHelper(Node node){
        if(node.left != null){
            postorderHelper(node.left);
        }
        if(node.right != null){
            postorderHelper(node.right);
        }
        System.out.print(node.value + " ");
    }

    public boolean bfs(int value) {
        Queue<Node> nodeQueue = new LinkedList<>();
        nodeQueue.add(root);
        while (!nodeQueue.isEmpty()){
            Node tmpNode = nodeQueue.poll();
            if(tmpNode.value == value){
                return true;
            }

            if(tmpNode.left != null){
                nodeQueue.add(tmpNode.left);
            }
            if(tmpNode.right != null){
                nodeQueue.add(tmpNode.right);
            }
        }
        return false;
    }

    public boolean dfs(int value) {
        isFound = false;
        dfsHelper(root, value);
        return isFound;
    }
    private void dfsHelper(Node node, int value){
        if(isFound == true){
            return;
        }
        if(node.value == value){
            isFound = true;
            return;
        }
        if(node.left != null){
            dfsHelper(node.left, value);
        }
        if(node.right != null){
            dfsHelper(node.right, value);
        }
    }

    public boolean dfs2(int value){
        Stack<Node> nodeStack = new Stack<>();
        nodeStack.push(root);
        while(!nodeStack.isEmpty()){
            Node tmpNode = nodeStack.pop();
            if(tmpNode.value == value){
                return true;
            }
            if(tmpNode.right != null){
                nodeStack.push(tmpNode.right);
            }
            if(tmpNode.left != null){
                nodeStack.push(tmpNode.left);
            }
        }
        return false;
    }

}

class NodeBinaryTreeTest {
    public static void main(String[] args) {
        int [] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        BinaryTree tree = new BinaryTree(array);

        tree.preorder();
        tree.inorder();
        tree.postorder();

        System.out.println(tree.bfs(2));
        System.out.println(tree.bfs(10));

        System.out.println(tree.dfs(5));
        System.out.println(tree.dfs(14));

        System.out.println(tree.dfs2(8));
        System.out.println(tree.dfs2(19));
    }
}