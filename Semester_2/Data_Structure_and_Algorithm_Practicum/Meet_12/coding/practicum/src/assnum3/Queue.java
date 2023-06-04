package assnum3;

public class Queue {
    private DoubleLinkedList list;

    public Queue() {
        list = new DoubleLinkedList();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public void enqueue(int number, String data) {
        list.addLast(number, data);
    }

    public void dequeue() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue is empty. Cannot dequeue.");
        } else {
            list.removeFirst();
        }
    }

    public int size() {
        return list.size();
    }

    public void print() {
        list.print();
    }
}
