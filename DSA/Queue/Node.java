class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class QueueLinkedList {
    Node front, rear;

    // Constructor
    QueueLinkedList() {
        front = rear = null;
    }

    // Check if empty
    boolean isEmpty() {
        return front == null;
    }

    // Enqueue operation
    void enqueue(int data) {
        Node newNode = new Node(data);

        if (rear == null) {   // Empty queue
            front = rear = newNode;
            System.out.println(data + " inserted");
            return;
        }

        rear.next = newNode;
        rear = newNode;
        System.out.println(data + " inserted");
    }

    // Dequeue operation
    int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue Underflow");
            return -1;
        }

        int value = front.data;
        front = front.next;

        if (front == null) {  // If queue becomes empty
            rear = null;
        }

        return value;
    }

    // Peek operation
    int peek() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }
        return front.data;
    }

    // Display queue
    void display() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return;
        }

        Node temp = front;
        System.out.print("Queue elements: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        QueueLinkedList q = new QueueLinkedList();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        q.display();

        System.out.println("Deleted: " + q.dequeue());
        System.out.println("Front element: " + q.peek());

        q.display();
    }
}