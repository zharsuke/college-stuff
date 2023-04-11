import java.util.*;

public class ass2 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int element;

        System.out.print("Enter the number of array elements : ");
        element = scanner.nextInt();

        int [] num = new int[element];

        System.out.println();

        for (int i = 0; i < num.length; i++) {
            System.out.print("Enter the value of element : ");
            num[i] = scanner.nextInt();
        }

        System.out.println();

        int max = num[0];

        for (int i = 0; i < num.length; i++) {
            if (num[i] > max) {
                max = num[i];
            }
            System.out.print(num[i] + " ");
        }

        System.out.println();
        System.out.println();

        System.out.println("The largest number is " + max);

        scanner.close();
    }
}