package Practice.SinglyLinkedList;

class Node {
    public int value;
    public Node next;

    public Node(int value, Node next) {
        this.value = value;
        this.next = next;
    }
}

class SinglyLinkedList {
    private Node head;

    public SinglyLinkedList() {
        this.head = null;
    }

    public boolean isEmpty() {
        return (head == null) ? true : false;
    }

    public boolean prepend(int value) {

        this.head = new Node(value, this.head);

        return true;
    }

    public boolean append(int value) {
        Node tmpNode = this.head;
        if(head == null){
            head = new Node(value, null);
            return false;
        }
        while(tmpNode.next != null){
            tmpNode = tmpNode.next;
        }
        tmpNode.next = new Node(value, null);
        return true;
    }

    public boolean setHead(int index) {
        Node curNode = head;
        for (int i = 0; i < index; i++) {
            curNode = curNode.next;
        }
        head = curNode;
        return true;
    }

    public int access(int index) {
        Node curNode = this.head;
        for (int i = 0; i < index; i++) {
            if(curNode == null){
                return -1;
            }
            curNode = curNode.next;
        }
        return curNode.value;
    }

    public boolean insert(int index, int value) {
        Node prevNode = null;
        Node curNode = this.head;
        for (int i = 0; i < index; i++) {
            if(curNode == null){
                return false;
            }
            prevNode = curNode;
            curNode = curNode.next;
        }
        prevNode.next = new Node(value, curNode);
        return true;
    }

    public boolean remove(int index) {
        Node prevNode = null;
        Node curNode = this.head;
        Node nextNode = curNode.next;
        for (int i = 0; i < index; i++) {
            prevNode = curNode;
            curNode = curNode.next;
            nextNode = curNode.next;
        }
        prevNode.next = nextNode;
        return true;
    }

    public String toString() {
        Node curr = this.head;

        if (curr == null) {
            return "[]";
        }

        String s = "";
        while(curr != null) {
            s += curr.value + " ";
            curr = curr.next;
        }
        return s;
    }
}


public class SinglyLinkedListTest {
    public static void main(String[] args) {
        SinglyLinkedList myList = new SinglyLinkedList();
        System.out.println(myList);
        System.out.println("--------------------------------");

        for (int i = 0; i < 10; i++) {
            myList.append(i + 1);
        }
        System.out.println(myList);

        for (int i = 0; i < 10; i++) {
            myList.prepend(i + 1);
        }
        System.out.println(myList);

        int value = myList.access(3);
        System.out.println("myList.access(3) = " + value);

        myList.insert(8, 128);
        System.out.println(myList);

        myList.remove(4);
        System.out.println(myList);

        myList.setHead(10);
        System.out.println(myList);
    }
}
