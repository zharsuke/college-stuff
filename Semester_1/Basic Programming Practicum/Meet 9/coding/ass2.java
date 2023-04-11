import java.util.*;

public class ass2 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int num;

        System.out.print("Insert number (min 5) : ");
        num = scanner.nextInt();

        for (int i = 0; i <= num; i++) {
            if (num < 5) {
                break;
            }
            for (int j = 0; j <= num; j++) {
                if ((i+j) > num) {
                    break;
                }
                System.out.print("* ");
            }
            System.out.println();
        }
        scanner.close();
    }
}
