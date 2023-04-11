import java.util.*;

public class question4b {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insert number : ");
        int num = scanner.nextInt();
        printFibonacci(num);        
    }

    public static int fibonacci(int num) {
        if (num == 0 || num == 1) {
            return num;
        } else {
            return fibonacci(num -1) + fibonacci(num -2);
        }
    }

    public static void printFibonacci(int num) {
        System.out.println("Fibonacci sequence up to "  + num + " terms = ");
        for (int i = 0; i < num; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
}
