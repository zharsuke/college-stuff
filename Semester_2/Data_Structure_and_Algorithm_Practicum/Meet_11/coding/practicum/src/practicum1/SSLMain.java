package practicum1;

public class SSLMain {
    public static void main(String[] args) {
        SingleLinkedList singleLinkedList = new SingleLinkedList();

        singleLinkedList.print();
        singleLinkedList.addFirst(890);
        singleLinkedList.print();
        singleLinkedList.addLast(760);
        singleLinkedList.print();
        singleLinkedList.addFirst(700);
        singleLinkedList.print();
        singleLinkedList.insertAfter(700, 999);
        singleLinkedList.print();
        singleLinkedList.inserAt(3, 833);
        singleLinkedList.print();

        // add practicum 2
        System.out.println("Data in 1st index : " + singleLinkedList.getData(1));
        System.out.println("Data 3 is in index : " + singleLinkedList.indexOf(760));
        singleLinkedList.remove(999);
        singleLinkedList.print();
        singleLinkedList.removeAt(0);
        singleLinkedList.print();
        singleLinkedList.removeFirst();
        singleLinkedList.print();
        singleLinkedList.removeLast();
        singleLinkedList.print();

    }
}
