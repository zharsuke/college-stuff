package assnum3;

public class DoubleLinkedList {
    public Node head;
    public int size;

    public DoubleLinkedList() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(int number, String name) {
        if (isEmpty()) {
            head = new Node(null, number, name, head);
        } else {
            Node newNode = new Node(null, number, name, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast(int number, String name) {
        if (isEmpty()) {
            addFirst(number, name);
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            Node newNode = new Node(null, number, name, head);
            current.next = newNode;
            newNode.prev = current;
            size++;
        }
    }

    public void add(int number, String name, int index) throws Exception {
        if (isEmpty()) {
            addFirst(number, name);
        } else if (index < 0 || index > size) {
            throw new Exception("Index out of bound");
        } else {
            Node current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
            if (current.next == null) {
                Node newNode = new Node(null, number, name, head);
                current.prev = newNode;
                head = newNode;
            } else {
                Node newNode = new Node(null, number, name, head);
                newNode.prev = current.prev;
                newNode.next = current;
                current.prev.next = newNode;
                current.prev = newNode;
            }
            size++;
        }
    }

    public int size() {
        return size;
    }

    public void clear() {
        head = null;
        size = 0;
    }

    public void print() {
        if (!isEmpty()) {
            Node tmp = head;
            int count = 0;
            while (tmp != null) {
                System.out.println("No = " + tmp.number);
                System.out.println("Name = " + tmp.name);
                System.out.println();
                tmp = tmp.next;
                count++;
                if (count == size) {
                    break;
                }
            }
        } else {
            System.out.println("Linked list is empty");
        }
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
    
    public void remove(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Index value is out of bound");
        } else if (size == 0) {
            removeFirst();
        } else {
            Node current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
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
        }
    }
    
    public int getFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked list is still empty");
        }
        return head.number;
    }
    
    public int getLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked list is still empty");
        }
        Node tmp = head;
        while (tmp.next != null) {
            tmp = tmp.next;
        }
        return tmp.number;
    }
    
    public int get(int index) throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked list is still empty");
        }
        Node tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.number;
    }
}
