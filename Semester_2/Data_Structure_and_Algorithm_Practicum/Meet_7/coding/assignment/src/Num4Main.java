import java.util.Scanner;

public class Num4Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Num4 data = new Num4();
        System.out.println("List of data");
        data.print();

        System.out.println();
        System.out.println();

        System.out.println("List of data after sorting");
        data.bubbleSort();
        data.print();

        System.out.println();
        System.out.println();

        System.out.println("Max number = " + data.findMaxBruteForce()[0]);
        System.out.println("Amount of max number = " + data.findMaxBruteForce()[1]);

        System.out.println();

        System.out.print("Insert number that you want to search : ");
        int search = scanner.nextInt();

        System.out.println();

        System.out.println("Using sequential search");
        int position = data.findSeqSearch(search);

        data.showPosition(search, position);
        data.showData(search, position);
        
        scanner.close();
    }
}
