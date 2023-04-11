import java.util.*;

public class ass3 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int num;
        System.out.print("Insert number (min 3) : ");
        num = scanner.nextInt();

        for (int i = 1; i <= num; i++) {
            if (num < 3) {
                break;
            }
            for (int j = 1; j <= num; j++) {
                if (i == 1 && j <= num) {
                    System.out.print(num+" ");
                    continue;
                } else if (i == num && j <= num) {
                    System.out.print(num+" ");
                    continue;
                }else if (i <= num && j == 1) {
                    System.out.print(num+" ");
                    continue;
                } else if (i <= num && j == num) {
                    System.out.print(num+" ");
                    continue;
                } else {
                System.out.print("  ");
                }
            }
            System.out.println();
        }
        scanner.close();
    }
}
