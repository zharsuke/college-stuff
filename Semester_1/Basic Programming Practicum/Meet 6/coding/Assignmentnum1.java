import java.util.*;

public class Assignmentnum1 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        double length1, length2, length3;

        System.out.print("enter first length : ");
        length1 = scanner.nextDouble();
        System.out.print("enter seccond lenght : ");
        length2 = scanner.nextDouble();
        System.out.print("enter third length : ");
        length3 = scanner.nextDouble();

        if (length1 == length2 && length1 == length3) {
            System.out.println("Equilateral triangle");
        } else if (length1 == length2 || length2 == length3 || length1 == length3) {
            System.out.println("Isosceles Triangle");
        } else {
            System.out.println("Arbitary Triangle");
        }

    }
}
