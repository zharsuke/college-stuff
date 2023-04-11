import java.util.*;

public class Assignmentnum2 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int age;

        System.out.print("Input your age : ");
        age = scanner.nextInt();

        if (age >= 17) {
            System.out.println("Allowed drive");
        } else {
            System.out.println("Not allowed to drive");
        }

    }
}
