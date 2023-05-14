package practicum1;

public class SingleLinkedList {
    Node head;
    Node tail;
    
    public boolean isEmpty() {
        return head == null;
    }

    public void print() {
        if (!isEmpty()) {
            Node tmp = head;
            System.out.print("Linked list content : \t");
            while (tmp != null) {
                System.out.print(tmp.data + "\t");
                tmp = tmp.next;
            }
            System.out.println("");
        } else {
            System.out.println("Linked list is empty");
        }
    }

    public void addFirst(int input) {
        Node ndInput = new Node(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            ndInput.next = head;
            head = ndInput;
        }
    }

    public void addLast(int input) {
        Node ndInput = new Node(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }

    public void insertAfter(int key, int input) {
        Node ndInput = new Node(input, null);
        Node tmp = head;
        do {
            if (tmp.data == key) {
                ndInput.next = tmp.next;
                tmp.next = ndInput;
                if (ndInput.next == null) {
                    tail = ndInput;
                }
                break;
            }
            tmp = tmp.next;
        } while (tmp != null);
    }

    public void insertBefore(int key, int input) {
        Node ndInput = new Node(input, null);
    
        // If the list is empty, there is no node to insert before
        if (isEmpty()) {
            System.out.println("Linked list is empty");
            return;
        }
    
        // If the key is found at the head node, add the new node at the beginning
        if (head.data == key) {
            ndInput.next = head;
            head = ndInput;
            return;
        }
    
        // Traverse the linked list to find the key and insert the new node before it
        Node tmp = head;
        while (tmp.next != null) {
            if (tmp.next.data == key) {
                ndInput.next = tmp.next;
                tmp.next = ndInput;
                return;
            }
            tmp = tmp.next;
        }
    
        // If the key is not found in the linked list
        System.out.println("Key not found in the linked list");
    }
    

    public void inserAt(int index, int input) {
        if (index < 0) {
            System.out.println("Wrong index");
        } else if (index == 0) {
            addFirst(input);
        } else {
            Node tmp = head;
            for (int i = 0; i < index -1; i++) {
                tmp = tmp.next;
            }
            tmp.next = new Node(input, tmp.next);
            if (tmp.next.next == null) tail = tmp.next;
        }
    }

    // add practicum 2

    public int getData(int index) {
        Node tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.data;
    }

    public int indexOf( int key) {
        Node tmp = head;
        int index = 0;
        while (tmp != null && tmp.data != key) {
            tmp = tmp.next;
            index++;
        }

        if (tmp == null) {
            return -1;
        } else {
            return index;
        }
    }

    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("Linked list is empty. Cannot remove a data");
        } else if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
        }
    }

    public void removeLast() {
        if (isEmpty()) {
            System.out.println("Linked list is empty. Cannot remove a data");
        } else if (head == tail) {
            head = tail = null;
        } else {
            Node tmp = head;
            while (tmp.next != tail) {
                tmp = tmp.next;
            }
            tmp.next = null;
            tail = tmp;
        }
    }

    public void remove(int key) {
        if (isEmpty()) {
            System.out.println("Linked list is empty. Cannot remove a data");
        } else {
            Node tmp = head;
            while (tmp != null) {
                if ((tmp.data == key) && (tmp == head)) {
                    this.removeFirst();
                    break;
                } else if (tmp.data == key) {
                    tmp.next = tmp.next.next;
                    if (tmp.next == null) {
                        tail = tmp;
                    }
                    break;
                }
                tmp = tmp.next;
            }
        }
    }

    public void removeAt(int index) {
        if (index == 0) {
            removeFirst();
        } else {
            Node tmp = head;
            for (int i = 0; i < index -1; i++) {
                tmp = tmp.next;
            }
            tmp.next = tmp.next.next;
            if (tmp.next == null) {
                tail = tmp;
            }
        }
    }

}
