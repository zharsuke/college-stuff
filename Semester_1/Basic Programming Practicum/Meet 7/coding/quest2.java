import java.util.*;

public class quest2 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int n;

        System.out.print("Enter number : ");
        n = scanner.nextInt();

        int i = 0;
        while (i < n) {
            System.out.print("*");
            i++;
        }

        System.out.println();
        System.out.println();

        int j = 0;
        while (j != n) {
            System.out.print("*");
            j++;
            if (j != n) {
                continue;
            }
        }

    }
}
