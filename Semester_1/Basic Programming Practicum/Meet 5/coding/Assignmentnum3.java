import java.util.*;

public class Assignmentnum3 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        String student;
        double midterm_exam_score, final_exam_score, quiz_score, assignment_score, midterm_exam, final_exam, quiz, assignment, result_score;

        System.out.print("Enter name of student : ");
        student = scanner.next();
        System.out.print("Enter midterm exam score : ");
        midterm_exam_score = scanner.nextDouble();
        System.out.print("Enter final exam score : ");
        final_exam_score = scanner.nextDouble();
        System.out.print("Enter quiz score : ");
        quiz_score = scanner.nextDouble();
        System.out.print("Enter assignment score : ");
        assignment_score = scanner.nextDouble();

        midterm_exam = midterm_exam_score * 0.3;
        final_exam = final_exam_score * 0.4;
        quiz = quiz_score * 0.1;
        assignment = assignment_score * 0.2;

        result_score = midterm_exam + final_exam + quiz + assignment;

        if (result_score < 65) {
            System.out.println(student + " will get remedy");
        } else{
            System.out.println(student + " not remedy");
        }

    }
}
