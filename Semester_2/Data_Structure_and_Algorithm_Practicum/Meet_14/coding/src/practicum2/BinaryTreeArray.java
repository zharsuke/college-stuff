package practicum2;

public class BinaryTreeArray {
    int [] data;
    int idxLast;

    public BinaryTreeArray() {
        data = new int[10];
    }

    void populateData(int data [], int idxLast) {
        this.data = data;
        this.idxLast = idxLast;
    }

    void traverseInOrder(int idxStart) {
        if (idxStart <= idxLast) {
            traverseInOrder(2*idxStart+1);
            System.out.print(data[idxStart] + " ");
            traverseInOrder(2*idxStart+2);
        }
    }

    void traversePreOrder() {
        traversePreOrder(0);
    }
    
    void traversePostOrder() {
        traversePostOrder(0);
    }

    void traversePreOrder(int idxStart) {
        if (idxStart <= idxLast) {
            System.out.print(data[idxStart] + " ");
            traversePreOrder(2*idxStart+1);
            traversePreOrder(2*idxStart+2);
        }
    }

    void traversePostOrder(int idxStart) {
        if (idxStart <= idxLast) {
            traversePreOrder(2*idxStart+1);
            traversePreOrder(2*idxStart+2);
            System.out.print(data[idxStart] + " ");
        }
    }

    void add(int data) {
        if (idxLast == this.data.length -1) {
            System.out.println("Tree is full! Cannot add data!");
            return;
        }
        idxLast++;
        this.data[idxLast] = data;
    }
}
