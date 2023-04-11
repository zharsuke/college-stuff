import java.util.*;

public class question2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        long nim, twodigit = 0L;
        String [] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        System.out.print("Insert your NIM : ");
        nim = scanner.nextLong();

        twodigit = nim % 100;

        if (twodigit < 10) {
            twodigit += 10;
        }

        for (int i = 0; i < twodigit; i++) {
            System.out.print(days[count % 7] + " ");
            count++;            
        }


    }
}
