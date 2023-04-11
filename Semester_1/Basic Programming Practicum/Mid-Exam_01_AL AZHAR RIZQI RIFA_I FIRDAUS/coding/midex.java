import java.util.*;

public class midex {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        double daily_score, middle_exam, final_exam, quiz, final_score;
        String choices;

        do {
            
            System.out.print("Input daily score : ");
            daily_score = scanner.nextDouble();

            System.out.print("Input middle exam score : ");
            middle_exam = scanner.nextDouble();

            System.out.print("Input final exam score : ");
            final_exam = scanner.nextDouble();

            System.out.print("Input quiz score : ");
            quiz = scanner.nextDouble();

            final_score = (daily_score * 0.25) + (middle_exam * 0.30)+ (final_exam * 0.40)+ (quiz * 0.05);

            System.out.println("Your final score is " + final_score + "\n");

            System.out.print("Input data again ? <y/n> : ");
            choices = scanner.next();

        } while (choices.equalsIgnoreCase("y"));

        System.out.println("The program has been ended!!!");

        

    }
}
