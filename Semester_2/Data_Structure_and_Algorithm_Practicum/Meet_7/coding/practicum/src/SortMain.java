import java.util.Scanner;

public class SortMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insert amount of data : ");
        int amount = scanner.nextInt();
        MergeSorting number = new MergeSorting(amount);

        for (int i = 0; i < amount; i++) {
            System.out.print("Insert number : ");
            number.data[i] = scanner.nextInt();    
        }
        System.out.println();

        System.out.println("Sorting with merge sort");
        System.out.println("Initial data");
        number.printArray(number.data);
        System.out.println();
        
        System.out.println("Sorted data");
        number.mergeSort(number.data);
        number.printArray(number.data);




        scanner.close();
    }
}
