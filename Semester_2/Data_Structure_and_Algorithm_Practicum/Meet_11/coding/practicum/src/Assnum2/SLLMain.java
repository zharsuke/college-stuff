package Assnum2;

public class SLLMain {
    public static void main(String[] args) {
        SingleLinkedList singleLinkedList = new SingleLinkedList();

        singleLinkedList.print();
        singleLinkedList.addFirst('a');
        singleLinkedList.print();
        singleLinkedList.addLast('b');
        singleLinkedList.print();
        singleLinkedList.insertAfter('b', 'd');
        singleLinkedList.print();
        singleLinkedList.insertBefore('d', 'c');
        singleLinkedList.print();
        singleLinkedList.insertAt(4, 'e');
        singleLinkedList.print();
    }
}
