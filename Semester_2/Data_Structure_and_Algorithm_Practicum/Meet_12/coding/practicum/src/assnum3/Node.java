package assnum3;

public class Node {
    public String name;
    public int number;
    Node prev, next;

    public Node(Node prev, int number, String name, Node next) {
        this.prev = prev;
        this.next = next;
        this.name = name;
        this.number = number;
    }
}

