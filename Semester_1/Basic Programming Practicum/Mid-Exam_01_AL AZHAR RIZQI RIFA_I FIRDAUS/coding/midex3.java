import java.util.*;

public class midex3 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        double daily_score, middle_exam, final_exam, quiz, final_score;
        // String choices;
        int number_of_student, i = 0;

        System.out.print("Input number of student : ");
        number_of_student = scanner.nextInt();

        while (true) {
            i++;

            System.out.print("Input daily score : ");
            daily_score = scanner.nextDouble();

            System.out.print("Input middle exam score : ");
            middle_exam = scanner.nextDouble();

            System.out.print("Input final exam score : ");
            final_exam = scanner.nextDouble();

            System.out.print("Input quiz score : ");
            quiz = scanner.nextDouble();

            final_score = (daily_score * 0.25) + (middle_exam * 0.30)+ (final_exam * 0.40)+ (quiz * 0.05);

            if (final_score >= 55 || middle_exam == 100 && final_exam == 100) {
                System.out.println("Graduated");

                if (final_score < 70 && daily_score > 65 && middle_exam > 65 && final_exam > 65 && quiz > 65) {
                    System.out.println("Software Engineering major");
                } else if ( final_score > 70 && daily_score > 65 && quiz > 65) {
                    System.out.println("Multimedia Major");
                } else {
                    System.out.println("Information System Major");
                }

            } else {
                System.out.println("Not graduated!");
            }


            System.out.println("Your final score is " + final_score + "\n");

            if (i >= number_of_student) {
                break;
            }

        }
        System.out.println("The program has been ended!!!");
    }
}
