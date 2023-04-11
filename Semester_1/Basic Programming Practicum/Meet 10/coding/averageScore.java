import java.util.Scanner;

public class averageScore {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num_student;

        System.out.print("Enter the number of student : ");
        num_student = sc.nextInt();

        int [] score = new int[num_student];
        double total = 0;
        double average;

        for (int i = 0; i < score.length; i++) {
            System.out.print("Enter student score " + (i + 1) + " : ");
            score[i] = sc.nextInt();
        }

        for (int i = 0; i < score.length; i++) {
            total += score[i];
        }

        average = total / score.length;
        System.out.println("The class average score is " + average);

        sc.close();
    }
}