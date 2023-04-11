import java.util.Scanner;

public class Selection1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number;

        System.out.print("Enter number : ");
        number = scanner.nextInt();

        String output = (number % 2 == 0) ? "Even number" : "Odd number";
        System.out.println(output);

        // if (number % 2 == 0) {
        //     System.out.println("Even number");
        // } else {
        //     System.out.println("Odd number");
        // }

    }
}
