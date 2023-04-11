import java.util.*;

public class ArithmeticOperation {
    static int multiplication(int C, int D) {
        int H;
        H = (C + 10) % (D + 19);
        return H;
    }

    static int subtraction(int A, int B) {
        int X;
        A = A + 7;
        B = B + 4;
        X = multiplication(A, B);
        return X;
    }

    static void checkMin(int value1, int value2) {
        if (value1 < 0) {
            value1 = 0;
            System.out.println("Minimal value 1 is 0 !");
            System.exit(0);
        } else if (value2 < 0) {
            value2 = 0;
            System.out.println("Minimal value 2 is 0 !");
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        int value1, value2;
        Scanner input = new Scanner(System.in);
        System.out.print("Input value 1 : ");
        value1 = input.nextInt();
        System.out.print("Input value 2 : ");
        value2 = input.nextInt();
        checkMin(value1, value2);
        int result = subtraction(value1, value2);
        System.out.println("The result is " + result);
        input.close();
    }
}