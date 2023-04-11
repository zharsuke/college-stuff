import java.util.*;

public class ass1 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int num;

        System.out.print("Enter a number : ");
        num = scanner.nextInt();

        for (int i = 1; i <= num; i++) {

            if (i == 5) {
                continue;
            }

            System.out.println(i);
        }

    }    
}
