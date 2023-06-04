package assnum1;

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

    // choose 1
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

    // choose 2
    public void addLast(int item) {
         if (isEmpty()) {
            addFirst(item);
         } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            Node newNode = new Node(current, item, null);
            current.next = newNode;
            size++;
         }
    }

    // choose 3
    public void add(int item, int index) throws Exception {
        if (isEmpty()) {
            addFirst(item);
        } else if (index < 0 || index > size ) {
            throw new Exception("Index out of bound");
        } else {
            Node current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
            if (current.next == null) {
                Node newNode = new Node(null, item, current);
                current.prev = newNode;
                head = newNode;
            } else {
                Node newNode = new Node(current.prev, item, current);
                newNode.prev = current.prev;
                newNode.next = current;
                current.prev.next = newNode;
                current.prev = newNode;
            }
        }
        size++;
    }

    // choose 7
    public void print() {
        if (!isEmpty()) {
            Node tmp = head;
            while (tmp != null) {
                System.out.println(tmp.data);
                tmp = tmp.next;
            }
            // System.out.println("\n successfully added");
        } else {
            System.out.println("Linked list is empty");
        }
    }

    // add practicum 2
    // choose 4
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

    // choose 5
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

    // choose 6
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

    // add practicum 3
    public int getFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked list still empty");
        }
        return head.data;
    }

    public int getLast(int index) throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked list still empty");
        }
        Node tmp = head;
        while (tmp.next != null) {
            tmp = tmp.next;
        }
        return tmp.data;
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

    // choose 8
    public int sequentialSearch(int item) {
        Node current = head;
        for (int index = 0; current != null; index++) {
            if (current.data == item) {
                return index;
            }
            current = current.next;
        }
    
        return -1;
    }

    public void showPosition(int x, int pos) {
        if (pos != -1) {
            System.out.println("Data : " + x + " is found in index-" + pos);
        } else {
            System.out.println("Data : " + x + " is not found!");
        }
    }

    // public void showData(String x, int pos) {
    //     if (pos != -1) {
    //         System.out.println("NIM \t = " + x);
    //         System.out.println("Name \t = " + listStd[pos].name);
    //         System.out.println("GPA \t = " + listStd[pos].gpa);
    //     } else {
    //         System.out.println("Data " + x + " is not found!");
    //     }
    // }

    // choose 9
    public void bubbleSort() {
        if (head == null || head.next == null) {
            return; // No need to sort an empty list or a list with only one element
        }
    
        boolean swapped;
        Node current;
    
        for (int i = 0; i < size - 1; i++) {
            swapped = false;
            current = head;
    
            for (int j = 0; j < size - 1 - i; j++) {
                if (current.data < current.next.data) {
                    int temp = current.data;
                    current.data = current.next.data;
                    current.next.data = temp;
                    swapped = true;
                }
                current = current.next;
            }
    
            if (!swapped) {
                break;
            }
        }
    }
}
