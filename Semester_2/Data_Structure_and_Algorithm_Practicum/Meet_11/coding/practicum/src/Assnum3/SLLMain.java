package Assnum3;

public class SLLMain {
    public static void main(String[] args) {
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        
        singleLinkedList.print();
        singleLinkedList.addFirst("Multimedia");
        singleLinkedList.print();
        singleLinkedList.addLast("Statistika");
        singleLinkedList.print();
        singleLinkedList.insertAfter("Statistika", "Matematika");
        singleLinkedList.print();
        singleLinkedList.insertBefore("Matematika", "Algoritma");
        singleLinkedList.print();
        singleLinkedList.insertAt(4, "Basis Data");
        singleLinkedList.print();
        singleLinkedList.addLast("Komputer");
        singleLinkedList.print();
        singleLinkedList.addLast("Android");
        singleLinkedList.print();
        singleLinkedList.addLast("Bahasa");
        singleLinkedList.print();
    }
}
