package Assnum4;

public class Queue {
    private SingleLinkedList list;

    public Queue() {
        list = new SingleLinkedList();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public void enqueue(String name, String address, int customerAccountNumber) {
        list.addLast(name, address, customerAccountNumber);
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue.");
        } else {
            list.removeFirst();
        }
    }

    public void print() {
        list.print();
    }
}
