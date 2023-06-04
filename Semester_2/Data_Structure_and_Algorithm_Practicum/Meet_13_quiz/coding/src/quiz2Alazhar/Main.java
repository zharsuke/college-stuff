/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz2Alazhar;

public class Main {
    public static void main(String[] args){
        SingleLinkedList dll = new SingleLinkedList();
        dll.addFirst(45);
        dll.addFirst(10);
        dll.addFirst(10);
        dll.addFirst(15);
        dll.addFirst(150);
        dll.print();
        dll.deleteFirst();
        dll.print();
        //continue to call addLast, deleteLast, 
        //merge, split,
        System.out.println();
        split(dll);
        System.out.println();
        merge(dll, dll);
    } 
    //2.A.
    public static void merge(SingleLinkedList l1,
            SingleLinkedList l2){
        //complete this method
        SingleLinkedList l3 = new SingleLinkedList();
    
        Node currentNode = l1.head;
        while (currentNode != null) {
            l3.addLast(currentNode.data);
            currentNode = currentNode.n;
        }
        
        currentNode = l2.head;
        while (currentNode != null) {
            l3.addLast(currentNode.data);
            currentNode = currentNode.n;
        }
        
        l3.print();

        // Create a new SingleLinkedList called l3 to store the merged list.
        // Traverse through l1 and add each element to l3 using the addLast method.
        // Traverse through l2 and add each element to l3 using the addLast method.
        // Finally, print the merged list l3 using the print method.

    }
    //2.B. this will split sll to be 2 sll
    public static void split(SingleLinkedList l){
        //ex: 2,3,4,34,2,3,45,4 (original list)
        //1-> 2,3,4,34
        //2-> 2,3,45,4

        if (l.isEmpty()) {
            return;
        }

        SingleLinkedList odd = new SingleLinkedList();
        SingleLinkedList even = new SingleLinkedList();
        Node current = l.head;

        while (current != null) {
            if (current.data % 2 == 0) {
                even.addLast(current.data);
            } else {
                odd.addLast(current.data);
            }
            current = current.n;
        }

        System.out.print("Odd data = ");
        odd.print();
        System.out.println();
        System.out.print("Even data = ");
        even.print();

        // The split method takes a SingleLinkedList l as a parameter.
        // It first checks if the provided list l is empty by calling the isEmpty method. If the list is empty, it means there are no nodes, so the method simply returns without further processing.
        // Two new SingleLinkedList objects, odd and even, are created to store the odd and even numbers from the original list, respectively.
        // The method initializes a current node variable to point to the head of the original list.
        // A loop is executed to traverse through each node of the original list. It continues until current becomes null, indicating the end of the list.
        // Inside the loop, each node's data is checked to determine whether it is even or odd. If the data is divisible by 2 with no remainder (i.e., an even number), it is added to the even list using the addLast method of even. Otherwise, if the data is not divisible by 2 with no remainder (i.e., an odd number), it is added to the odd list using the addLast method of odd.
        // After processing each node in the original list, the method prints the contents of the odd list and the even list using the print method of each list.

    }
}
