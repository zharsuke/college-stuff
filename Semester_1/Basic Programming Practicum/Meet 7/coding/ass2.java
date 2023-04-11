import java.util.*;

public class ass2 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int num, res = 0, count = 0, divide = 0;
        double avg = 0;

        System.out.print("Enter a number range : ");
        num = scanner.nextInt();

        divide = num / 2;

        System.out.println("The number of even numbers from 1 to " + num + " is " + divide);

        for (int i = 1; i <= num; i++) {
            if (i % 2 == 0) {
                count++;
                
                res += i;
                avg = res / count;
                System.out.println("Even number " + count + " is " + i);
            }
            
        }

        System.out.println("The sum of the even numbers from 1 to " + num + " is " + res);
        System.out.println("The average of the even number from 1 to " + num + " is " + avg);

    }
}
