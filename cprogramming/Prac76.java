package cprogramming;
//76 Implement a Circular Queue
public class Prac76 {
    public static void main(String[] args) {
        CircularQueue cq = new CircularQueue(5);
        cq.isEmpty();
        cq.enqueue(1);
        cq.enqueue(2);
        cq.enqueue(3);
        cq.enqueue(4);
        cq.enqueue(5);
        cq.enqueue(6);

        cq.dequeue();
        cq.dequeue();
        cq.dequeue();
        cq.dequeue();
        cq.dequeue();
        cq.dequeue();
    }
}
class CircularQueue {
    int front, rear, size;
    int[] array;

    public CircularQueue(int capacity) {
        size = capacity;
        array = new int[size];
        front = rear = -1;

    }
    public boolean isEmpty() {
        return front == -1;
    }

    public boolean isFull() {
        return (front == 0 && rear == size - 1) || (rear == front - 1);
    }
    public void enqueue(int item) {
        if (isFull()) {
            System.out.println("Queue is full. Cannot enqueue.");
            return;
        }
        if (isEmpty()) {
            front = rear = 0;
        } else if (rear == size - 1) {
            rear = 0;
        } else {
            rear++;
        }
        array[rear] = item;
        System.out.println(item + " enqueued to the queue");
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return -1;
        }
        int item = array[front];
        if (front == rear) {
            front = rear = -1;
        } else if (front == size - 1) {
            front = 0;
        } else {
            front++;
        }
        System.out.println(item + " dequeued from the queue");
        return item;
    }
}