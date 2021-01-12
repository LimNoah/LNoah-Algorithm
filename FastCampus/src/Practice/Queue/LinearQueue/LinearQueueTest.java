package Practice.Queue.LinearQueue;

class LinearQueue {
    private int capacity;
    private int front;
    private int rear;
    private int[] array;

    public LinearQueue(int capacity) {
        this.capacity = capacity;
        this.front = 0;
        this.rear = 0;
        this.array = new int[capacity];
    }

    public boolean put(int value) {
        if(rear >= capacity){
            return false;
        }
        this.array[rear++] = value;
        return true;
    }

    public int get() {
        if(front >= rear || front >= capacity){
            return -1;
        }
        return this.array[front++];
    }

    public int peek() {
        if(front >= rear){
            return -1;
        }
        return this.array[front];
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();

        if(front == rear){
            return "[ ]";
        }
        for (int i = front; i < rear; i++) {
            sb.append(array[i] + " ");
        }

        return ("[ " + sb.toString() + "]");
    }
}

class LinearQueueTest {
    public static void main(String[] args) {
        LinearQueue queue = new LinearQueue(5);
        System.out.println(queue);

        queue.put(1);
        queue.put(2);
        queue.put(3);
        System.out.println(queue);

        System.out.println((queue.get()));
        System.out.println((queue.get()));
        System.out.println((queue.get()));
        System.out.println((queue.get()));
        System.out.println(queue);

        queue.put(4);
        queue.put(5);
        queue.put(6);
        System.out.println(queue);

        System.out.println((queue.get()));
        System.out.println((queue.get()));
        System.out.println((queue.peek()));
        System.out.println((queue.peek()));

        System.out.println((queue.get()));
        System.out.println(queue);
    }
}