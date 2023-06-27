package practicum2;

public class BinaryTreeMain {
    public static void main(String[] args) {
        BinaryTreeArray bta = new BinaryTreeArray();

        int [] data = {6,4,8,3,5,7,9,0,0,0};
        int idxLast = 6;
        bta.populateData(data, idxLast);
        bta.traverseInOrder(0);
        System.out.println();
        bta.traversePreOrder();
        System.out.println();
        bta.traversePostOrder();
        System.out.println();
        bta.add(10);
        bta.add(15);
        bta.traverseInOrder(0);
    }
}
