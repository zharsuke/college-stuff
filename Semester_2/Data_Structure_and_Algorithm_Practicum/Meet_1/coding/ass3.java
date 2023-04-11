import java.util.*;

public class ass3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insert number : ");
        int n = scanner.nextInt();
        int num = 2;
        
        for (int i = 0; i < n; i++) {
            System.out.print(num + " ");
            num += 4;
        }

    }
}
