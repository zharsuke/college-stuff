package Assnum4;

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
                System.out.print(tmp.name  + " " + tmp.address + " " + tmp.customerAccountNumber + "\t");
                tmp = tmp.next;
            }
            System.out.println("");
        } else {
            System.out.println("Linked list is empty");
        }
    }

    public void addFirst(String name, String address, int customerAccountNumber) {
        Node ndInput = new Node(name, address, customerAccountNumber, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            ndInput.next = head;
            head = ndInput;
        }
    }

    public void addLast(String name, String address, int customerAccountNumber) {
        Node ndInput = new Node(name, address, customerAccountNumber, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }

    public void insertAfter(String key, String name, String address, int customerAccountNumber) {
        Node ndInput = new Node(name, address, customerAccountNumber, null);
        Node tmp = head;
        do {
            if (tmp.name == key) {
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

    public void insertBefore(String key, String name, String address, int customerAccountNumber) {
        Node ndInput = new Node(name, address, customerAccountNumber, null);
    
        // If the list is empty, there is no node to insert before
        if (isEmpty()) {
            System.out.println("Linked list is empty");
            return;
        }
    
        // If the key is found at the head node, add the new node at the beginning
        if (head.name == key) {
            ndInput.next = head;
            head = ndInput;
            return;
        }
    
        // Traverse the linked list to find the key and insert the new node before it
        Node tmp = head;
        while (tmp.next != null) {
            if (tmp.next.name == key) {
                ndInput.next = tmp.next;
                tmp.next = ndInput;
                return;
            }
            tmp = tmp.next;
        }
    
        // If the key is not found in the linked list
        System.out.println("Key not found in the linked list");
    }
    

    public void insertAt(int index, String name, String address, int customerAccountNumber) {
        if (index < 0) {
            System.out.println("Wrong index");
        } else if (index == 0) {
            addFirst(name, address, customerAccountNumber);
        } else {
            Node tmp = head;
            for (int i = 0; i < index -1; i++) {
                tmp = tmp.next;
            }
            tmp.next = new Node(name, address, customerAccountNumber, tmp.next);
            if (tmp.next.next == null) tail = tmp.next;
        }
    }

    public String getData(int index) {
        Node tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.name;
    }

    public int indexOf(String key) {
        Node tmp = head;
        int index = 0;
        while (tmp != null && tmp.name != key) {
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

    public void remove(String key) {
        if (isEmpty()) {
            System.out.println("Linked list is empty. Cannot remove a data");
        } else {
            Node tmp = head;
            while (tmp != null) {
                if ((tmp.name == key) && (tmp == head)) {
                    this.removeFirst();
                    break;
                } else if (tmp.name == key) {
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
