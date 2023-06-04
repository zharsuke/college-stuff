package assnum2;

public class Stack {
    private Node top;
    private int size;

    public Stack() {
        top = null;
        size = 0;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public void push(String item) {
        Node newNode = new Node(null, item, top);
        if (top != null) {
            top.prev = newNode;
        }
        top = newNode;
        size++;
    }

    public String pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("Stack is empty");
        }
        String topData = top.data;
        top = top.next;
        if (top != null) {
            top.prev = null;
        }
        size--;
        return topData;
    }

    public String peek() throws Exception {
        if (isEmpty()) {
            throw new Exception("Stack is empty");
        }
        return top.data;
    }

    public void print() {
        if (!isEmpty()) {
            Node tmp = top;
            System.out.println("Info all books");
            System.out.println("==========================================");
            while (tmp != null) {
                System.out.println(tmp.data);
                tmp = tmp.next;
            }
        } else {
            System.out.println("Stack is empty");
        }
    }
}
