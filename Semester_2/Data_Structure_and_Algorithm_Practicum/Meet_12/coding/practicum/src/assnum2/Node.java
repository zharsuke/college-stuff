package assnum2;

public class Node {
    public String data;
    Node prev, next;

    public Node(Node prev, String data, Node next) {
        this.prev = prev;
        this.next = next;
        this.data = data;
    }
}
