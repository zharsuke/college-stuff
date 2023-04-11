import java.util.*;

public class question4a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insert number : ");
        int num = scanner.nextInt();
        printFibonacci(num);
    }

    public static void printFibonacci(int num) {
        int a = 0, b = 1, c;
        System.out.println("Fibonacci sequence up to "  + num + " terms = ");

        for (int i = 0; i < num; i++) {
            if (i <= 1) {
                c = i;
            } else {
                c = a + b;
                a = b;
                b = c;
            }
            System.out.print(c + " ");
        }
    }
}
