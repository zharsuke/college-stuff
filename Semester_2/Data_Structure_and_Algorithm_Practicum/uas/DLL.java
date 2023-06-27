

public class DLL {
    Node2P head;

    public DLL() {
        head = null;
    }
    
    //soal 1

    int[] toArray(){
       int [] data = new int[size()]; // It creates an empty array.
       Node2P tmp = head;
       int index = 0;
       while (tmp != null) { // It traverses the DLL using a loop, retrieves the data from each node, and adds it to the array.
        data[index++] = tmp.data;
        tmp = tmp.next;
       }
       return data; // Finally, it returns the populated array.
    }

    //soal 2
    DLL sublist(int start, int end){
        DLL sublist = new DLL();
        if (start < 0 || end >= size() || start > end) { // It checks if the given start and end positions are valid within the range of the DLL.
            System.out.println("Invalid sublist range!!");
            return sublist;
        }
        Node2P tmp = head;
        int index = 0;
        while (tmp != null && index <= end) {
            if (index >= start) { // If the positions are valid, it creates a new DLL object, subList, and copies the elements from the DLL's start position 
            //to the end position into subList.
                sublist.addLast(tmp.data);
            }
            tmp = tmp.next;
            index++;
        }
        return sublist; // Finally, it returns the subList.
    }

    //soal 3
    void addAll(DLL list){
        Node2P tmp = list.head; // It adds all the elements from the given list DLL to the tmp DLL.
        while (tmp!=null){ // It uses a loop to iterate over each element in list and calls the addLast() method to add it to the current DLL.
            addLast(tmp.data);
            tmp = tmp.next;
        }
    }

    //soal 4
    boolean containsAll(DLL list){
        Node2P tmp = list.head;
        while (tmp != null) { // It uses a loop to iterate over each element in list and checks its existence in the current DLL using the contains() 
            // helper method.
            if (!contains(tmp.data)) { // It checks if all the elements from the given list DLL exist in the current DLL.
                return false;
            }
            tmp = tmp.next;
        }
        return true; 
        // If any element is not found, it returns false; otherwise, it returns true.
    }

    boolean contains(int value) {
        Node2P tmp = head;
        while (tmp != null) {
            if (tmp.data == value) {
                return true;
            }
            tmp = tmp.next;
        }
        return false;
    }

    //soal 5
    void removeAll(DLL list){
        // It removes all the elements from the current DLL that also exist in the given list DLL.
       Node2P tmp = list.head;
       while (tmp != null) { // It uses a loop to iterate over each element in list and calls the deleteByData() method to remove the corresponding 
        // elements from the current DLL.
        deleteByData(tmp.data);
        tmp = tmp.next;
       }
    }

    int get(int idx){
        if(idx<0||idx>=size()){
            System.out.println("Idx invalid!");
            return -1;
        }else{
            Node2P tmp = head;
            for(int i=0;i<idx;i++){
                tmp=tmp.next;
            }
            return tmp.data;
        }
    }

    void deleteByData(int data){
        Node2P tmp = head;
        while(tmp!=null){
            if(tmp.data == data){
                if(tmp.prev == null){
                    deleteFirst();
                }else if(tmp.next == null){
                    deleteLast();
                }else{
                    tmp.prev.next = tmp.next;
                    tmp.next.prev = tmp.prev;
                }
            }
            tmp = tmp.next;
        }
    }

    boolean isEmpty(){
        return head==null? true:false;
    }
    int size(){
        int n = 0;
        Node2P tmp = head;
        while (tmp!=null){
            n++;
            tmp = tmp.next;
        }
        return n;
    }
    
       void addLast(int in){
        Node2P newNode = new Node2P(in);
        if(isEmpty()){
            head = newNode;
        }else{
            Node2P tmp = head;
            while(tmp.next!=null){
                tmp = tmp.next;
            }
            tmp.next = newNode;
            newNode.prev = tmp;
        }     
    }
    
    void deleteFirst(){
        if(isEmpty()){
            System.out.println("Data kosong! operasi deleteFirst gagal!");
        }else if(size()==1){
            head=null;
        }else{
            Node2P del = head;
            head.next.prev = null;
            head = head.next;
            del = null;
        }
    }
    void deleteLast(){
        if(isEmpty()){
            System.out.println("Data kosong! Operasi deleteLast gagal!");
        }else if(size()==1){
            head=null;
        }else{
            Node2P tmp = head;
            while(tmp.next!=null){
                tmp=tmp.next;
            }
            tmp.prev.next = null;
            tmp.prev = null;
            tmp = null;
        }
    }
    
    void print(){
        if(isEmpty()){
            System.out.println("Data kosong! Operasi print gagal");
        }else{
            Node2P tmp = head;
            while(tmp!=null){
                System.out.print(""+tmp.data);
                if(tmp.next!=null)
                    System.out.print("-");
                tmp=tmp.next;
            }
            System.out.println("");
        }
    }
}
