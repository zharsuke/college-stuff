import java.util.Scanner;

public class Num3Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Num3 data = new Num3();
        
        System.out.println("=======================");
        System.out.println("List of data");
        data.print();
        
        System.out.println();
        
        System.out.print("Insert number that you want to search : ");
        int search = scanner.nextInt();

        System.out.println();

        System.out.println("Using sequential search");
        int [] position = data.findSeqSearch(search);

        System.out.println();

        data.showPosition(search, position);
        System.out.println();
        data.showData(search, position);



        scanner.close();
    }
}
