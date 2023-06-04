package practicum1;

public class Node {
    public int data;
    Node prev, next;

    public Node(Node prev, int data, Node next) {
        this.prev = prev;
        this.next = next;
        this.data = data;
    }
}
