import java.util.*;

public class ass3 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        Integer element;

        System.out.print("Enter the number of array element : ");
        element = scanner.nextInt();

        Integer [] num = new Integer[element];

        System.out.println();

        for (int i = 0; i < num.length; i++) {
            System.out.print("Enter the value of element " + i + " : ");
            num[i] = scanner.nextInt();
        }

        System.out.println();

        Arrays.sort(num, Collections.reverseOrder());
        // System.out.println(Arrays.toString(num));

        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 == 0) {
                System.out.println("Even number : " + num[i]);
            }
        }

        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 != 0) {
                System.out.println("Odd number : " + num[i]);
            }
        }

        scanner.close();
    }
}