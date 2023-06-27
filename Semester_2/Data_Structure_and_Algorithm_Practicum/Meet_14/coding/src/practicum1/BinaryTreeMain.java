package practicum1;

import java.util.Scanner;

public class BinaryTreeMain {
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        Scanner sc = new Scanner(System.in);

        bt.addRecursive(6);
        bt.addRecursive(4);
        bt.addRecursive(8);
        bt.addRecursive(3);
        bt.addRecursive(5);
        bt.addRecursive(7);
        bt.addRecursive(9);
        bt.addRecursive(10);
        bt.addRecursive(15);

        int choice;
        
        do {
            display();
            System.out.print("Insert choice : ");
            choice = sc.nextInt();    
            switch (choice) {
                case 1:
                    System.out.print("Insert number to add : ");
                    int number1 = sc.nextInt();
                    bt.add(number1);
                    break;
                case 2:
                    System.out.print("Insert number to delete : ");
                    int number2 = sc.nextInt();
                    bt.delete(number2);
                    break;
                case 3:
                    System.out.print("Insert number to find : ");
                    int number3 = sc.nextInt();
                    System.out.println("Number " + number3 + " found : " + bt.find(number3));
                    break;
                case 4:
                    System.out.print("Traverse in order : ");
                    bt.traverseInOrder(bt.root);
                    System.out.println();
                    break;
                case 5:
                    System.out.print("Traverse pre order : ");
                    bt.traversePreOrder(bt.root);
                    System.out.println();
                    break;
                case 6:
                    System.out.print("Traverse post order : ");
                    bt.traversePostOrder(bt.root);
                    System.out.println();
                    break;
                case 7:
                    System.exit(0);
                    break;
            
                default:
                    System.out.println("Invalid input!");
                    break;
            }        
        } while (choice != 7);
        sc.close();

        // bt.traversePreOrder(bt.root);
        // System.out.println();
        // bt.traverseInOrder(bt.root);
        // System.out.println();
        // bt.traversePostOrder(bt.root);
        // System.out.println();
        // System.out.println("Find " + bt.find(5));
        // bt.delete(8);
        // bt.traversePreOrder(bt.root);
        // System.out.println();

        // System.out.println("Smallest value = " + bt.findSmallestValue());
        // System.out.println("Largest value = " + bt.findLargestValue());
        // System.out.println();

        // System.out.print("Data in leaf = ");
        // bt.displayLeafNode();
        // System.out.println();

        // System.out.println("Number of leaf node : " + bt.countLeave());
    }

    public static void display() {
        System.out.println("Binary Tree Operations");
        System.out.println("1. Add");
        System.out.println("2. Delete");
        System.out.println("3. Find");
        System.out.println("4. Traverse Order");
        System.out.println("5. Traverse PreOrder");
        System.out.println("6. Traverse PostOrder");
        System.out.println("7. Exit");
    }
}
