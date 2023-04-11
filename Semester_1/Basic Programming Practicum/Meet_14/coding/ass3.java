import java.util.*;

public class ass3 {

    static Scanner scanner = new Scanner(System.in);
    static int[] array_B = new int[10];
    static void fillArray() {
        for (int i = 0; i < array_B.length; i++) {
            System.out.print("Insert number : ");
            array_B[i] = scanner.nextInt();
        }
    }

    static double averageArray(int[] array_B) {
        double average = 0, total = 0;
        for (int i = 0; i < array_B.length; i++) {
            total += array_B[i];
        }
        average = total / ass3.array_B.length;
        System.out.printf("\nAverage = %.2f", average);
        return average;
    }

    public static void main(String[] args) {
        
    fillArray();
    averageArray(array_B);

    }
}