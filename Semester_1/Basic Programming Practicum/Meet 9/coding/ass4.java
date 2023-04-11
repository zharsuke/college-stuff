import java.util.*;

public class ass4 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int num;
        System.out.print("Insert number (min 5) : ");
        num = scanner.nextInt();

        for (int i = 1; i <= num; i++) {
            if (num < 5) {
                break;
            }
            if (i % 2 != 0) {
                for (int j = 1; j <= num; j++) {
                    System.out.print(j);
                }
            } else {
                for (int j = num; j > 0; j--) {
                    System.out.print(j);
                }
            }
            System.out.println();
        }
        scanner.close();
    }
}
