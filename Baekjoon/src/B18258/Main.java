package B18258;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Node {
    private int data;
    private Node next;

    public Node(int data, Node next){
        this.data = data;
        this.next = next;
    }

    public int getData() {
        return data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}

class LinkedQueue{
    private Node head;
    private Node tail;
    private int size;

    public LinkedQueue() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public void push(int X){
        Node newNode = new Node(X, null);
        if(size == 0){
            this.head = newNode;
            this.tail = this.head;
        } else {
            this.tail.setNext(newNode);
            this.tail = newNode;
        }
        size++;
    }

    public int pop(){
        if(size == 0){
            return -1;
        }
        int data = this.head.getData();
        this.head = this.head.getNext();
        size--;
        return data;
    }

    public int size(){
        return this.size;
    }

    public int empty(){
        return size == 0 ? 1 : 0;
    }

    public int front(){
        return size == 0 ? -1 : this.head.getData();
    }

    public int back(){
        return size == 0 ? -1 : this.tail.getData();
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        LinkedQueue lq = new LinkedQueue();

        int N = Integer.parseInt(br.readLine());

        for(int i = 0; i < N; i++){
            String str = br.readLine();

            if(str.contains("push")){
                lq.push(Integer.parseInt(str.substring(5)));
            } else if(str.equals("pop")){
                sb.append(lq.pop()).append("\n");
            } else if(str.equals("size")){
                sb.append(lq.size()).append("\n");
            } else if(str.equals("empty")){
                sb.append(lq.empty()).append("\n");
            } else if(str.equals("front")){
                sb.append(lq.front()).append("\n");
            } else if(str.equals("back")){
                sb.append(lq.back()).append("\n");
            }
        }
        System.out.println(sb);
    }
}