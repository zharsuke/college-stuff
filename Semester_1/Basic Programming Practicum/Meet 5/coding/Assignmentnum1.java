import java.util.*;

public class Assignmentnum1 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int num1, num2;

        System.out.print("Enter first number : ");
        num1 = scanner.nextInt();
        System.out.print("Enter seccond number : ");
        num2 = scanner.nextInt();

        if (num1 > num2) {
            System.out.println("The largest number is " + num1);
        } else {
            System.out.println("The largest number is " + num2);
        }

    }
}
