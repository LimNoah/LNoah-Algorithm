package Practice.DoublyLinkedList;

class Node {
    public int value;
    public Node next;
    public Node prev;

    public Node(int value, Node next, Node prev) {
        this.value = value;
        this.next = next;
        this.prev = prev;
    }
}

class DoublyLinkedList {
    private Node head;
    private Node tail;

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public boolean isEmpty() {
        return (head == null);
    }

    public boolean prepend(int value) {
        if(isEmpty()){
            this.head = new Node(value,null,null);
            this.tail = head;
            return true;
        }
        Node newNode = new Node(value, this.head, null);
        this.head.prev = newNode;
        this.head = newNode;
        return true;
    }

    public boolean append(int value) {
        if(isEmpty()){
            this.head = new Node(value,null,null);
            this.tail = head;
            return true;
        }
        Node newNode = new Node(value, null, this.tail);
        this.tail.next = newNode;
        this.tail = newNode;

        return true;
    }

    public boolean setHead(int index) {
        Node cpyHeadNode = this.head;
        for (int i = 0; i < index; i++) {
            if(this.head.next == null){
                this.head = cpyHeadNode;
                return false;
            }
            this.head = this.head.next;
        }
        this.head.prev = null;
        return true;
    }

    private Node accessNode(int index){
        Node accessNode = this.head;
        for (int i = 0; i < index; i++) {
            if(accessNode.next == null){
                return null;
            }
            accessNode = accessNode.next;
        }
        return accessNode;
    }

    public int access(int index) {
        return accessNode(index).value;
    }

    public boolean insert(int index, int value) {
        Node accessNode = accessNode(index);
        if(accessNode == null){
            return false;
        }
        Node newNode = new Node(value, accessNode, accessNode.prev);
        accessNode.prev.next = newNode;
        accessNode.prev = newNode;
        return true;
    }

    public boolean remove(int index) {
        if(accessNode(index) == null){
            return false;
        }
        Node curNode = accessNode(index);
        curNode.prev.next = curNode.next;
        curNode.next.prev = curNode.prev;
//        Node access = accessNode(index);      // 굳이 null 처리 안해도 GC가 처리해 줄까?
//        access = null;
        return true;
    }

    public String toString() {
        Node curNode = this.head;
        StringBuilder sb = new StringBuilder();

        if (curNode == null) {
            sb.append("[ ]\n");
            return sb.toString();
        }

        while (curNode != null){
            sb.append(curNode.value + " ");
            curNode = curNode.next;
        }
        String s = "\nhead.value : " + head.value + ", tail.value : " + tail.value + "\n";
        return "[ " + sb.toString() + "]" + s;
    }

    public String toStringInv() {
        Node curNode = this.tail;
        StringBuilder sb = new StringBuilder();
        if(curNode == null){
            sb.append("<<Inv>>\n[ ]\n");
            return sb.toString();
        }

        while (curNode != null){
            sb.append((curNode.value) + " ");
            curNode = curNode.prev;
        }
        String s = "\nhead.value : " + head.value + ", tail.value : " + tail.value + "\n";
        return "<<Inv>>\n[ " + sb.toString() + "]" + s;
    }
}


public class DoublyLinkedListTest {
    public static void main(String[] args) {
        DoublyLinkedList myList = new DoublyLinkedList();
        System.out.print(myList);
        System.out.println(myList.toStringInv());

        for (int i = 0; i < 10; i++) {
            myList.prepend(i + 1);
        }
        System.out.print(myList);
        System.out.println(myList.toStringInv());

        for (int i = 0; i < 10; i++) {
            myList.append(i + 1);
        }
        System.out.print(myList);
        System.out.println(myList.toStringInv());

        int value = myList.access(3);
        System.out.println("myList.access(3) = " + value + "\n");

        myList.insert(8, 128);
        System.out.print(myList);
        System.out.println(myList.toStringInv());

        myList.remove(4);
        System.out.print(myList);
        System.out.println(myList.toStringInv());

        myList.setHead(3);
        System.out.print(myList);
        System.out.println(myList.toStringInv());
    }
}
