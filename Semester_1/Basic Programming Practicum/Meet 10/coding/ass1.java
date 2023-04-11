import java.util.*;

public class ass1 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int element;

        System.out.print("Insert amount of array element : ");
        element = scanner.nextInt();

        int [] num = new int[element];

        System.out.println();

        for (int i = 0; i < num.length; i++) {
            System.out.print("Insert number from index " + i + " : ");
            num[i] = scanner.nextInt();
        }

        System.out.println();

        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }

        System.out.println();

        for (int i = num.length-1; i >= 0; i--) {
            System.out.print(num[i] + " ");
        }
        
    scanner.close();
    }
}