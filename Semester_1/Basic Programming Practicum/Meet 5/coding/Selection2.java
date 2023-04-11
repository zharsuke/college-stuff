import java.util.Scanner;

public class Selection2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double score1, score2, avg;


        System.out.print("Enter the first score : ");
        score1 = scanner.nextInt();
        System.out.print("Enter the seccond score : ");
        score2 = scanner.nextInt();

        avg = ( score1 + score2 ) / 2;

        if (avg >= 100) {
            avg -= 5;
            System.out.println("The average score is " + avg);    
        } else {
            System.out.println("The average score is " + avg);    
        }

    }
}
