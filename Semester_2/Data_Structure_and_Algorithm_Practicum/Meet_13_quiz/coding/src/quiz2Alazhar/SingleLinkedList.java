package quiz2Alazhar;

public class SingleLinkedList {
    Node head, tail;
    int size;
    
    SingleLinkedList(){
        head = tail = null;
        size=0;
    }
    boolean isEmpty(){
        return size==0;
    }
    void addFirst(int data){
        Node nu = new Node(data);
        if(isEmpty()){
            head = tail = nu;
        }else{
            nu.n = head;
            head = nu;
        }
        size++;
    } 
    void deleteFirst(){
        Node tmp = head.n;
        head = head.n;
        tmp = null;
        size--;
    }
    void print(){
        Node tmp = head;
        while(tmp!=null){
            System.out.print(""+tmp.data+"-");
            tmp = tmp.n;
        }
        System.out.println("");
    } 
    //1.A. complete the missing code addLast
    /**
     * this method will add new node at the last
     */
    void addLast(int data){
        Node nu = new Node(data);
        if(isEmpty()){
            head = tail = nu;
        }else{
           //complete here
           tail.n = nu;
           tail = nu;
        }
        size++;

        // The addLast method takes an integer value data as a parameter.
        // Inside the method, a new node nu is created with the provided data.
        // Next, it checks if the linked list is empty by calling the isEmpty method. If the list is empty, it means that there are no existing nodes in the list.
        // If the list is empty, the newly created node nu becomes both the head and the tail of the linked list. This is because when there are no nodes in the list, adding a node sets it as both the first and last node in the list.
        // If the list is not empty, meaning there are already existing nodes, the else block is executed. This block is responsible for adding the new node nu at the end of the linked list
        // - The n (next) reference of the current tail node is set to the new node nu. This connects the last node in the list to the new node.
        // - The tail reference is updated to point to the new node nu. Now, the new node becomes the last node in the list.
        // after adding the new node, the size of the linked list is incremented to keep track of the number of nodes in the list.
    }


    //1.B. complete the deleteLast
    /**
     * this method will remove tail
     */
    void deleteLast(){
       
        
    }
}
