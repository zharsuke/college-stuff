package practicum1;

public class LinkedList {
    public Node head;
    public int size;

    public LinkedList() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(int item) {
        if (isEmpty()) {
            head = new Node(null, item, head);
        } else {
            Node newNode = new Node(null, item, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public int size() {
        return size;
    }

    public int get(int index) throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked list still empty");
        }
        Node tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.data;
    }

    public void removeFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked list is still empty, cannot remove");
        } else if (size == 1) {
            removeLast();
        } else {
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    public void removeLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked list is still empty, cannot remove");
        } else if (head.next == null) {
            head = null;
            size--;
            return;
        }
        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
        size--;
    }

    public void remove(int value) throws Exception {
        if (isEmpty()) {
            throw new Exception("Data is empty");
        } else {
            Node current = head;
            if (current.data == value) {
                removeFirst();
                return;
            }
            while (current != null) {
                if (current.data == value) {
                    if (current.next == null) {
                        current.prev.next = null;
                    } else if (current.prev == null) {
                        current = current.next;
                        current.prev = null;
                        head = current;
                    } else {
                        current.prev.next = current.next;
                        current.next.prev = current.prev;
                    }
                size--;
                return;
                }
            current = current.next;
            }
            throw new Exception("Data not found!");
        }
    }

    public void clear() {
        head = null;
        size = 0;
    }
}
