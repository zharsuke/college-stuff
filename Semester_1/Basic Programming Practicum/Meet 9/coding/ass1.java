import java.util.*;

public class ass1 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int num;

        System.out.print("Insert number (min 3) : ");
        num = scanner.nextInt();

        for (int i = 1; i <= num; i++) {
            if (num < 3) {
                break;
            }
            for (int j = num; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        scanner.close();
    }
}
