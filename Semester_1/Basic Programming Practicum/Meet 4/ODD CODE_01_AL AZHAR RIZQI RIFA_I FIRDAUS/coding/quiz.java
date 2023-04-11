// ODD CODE
// 01_AL AZHAR RIZQI RIFA'I FIRDAUS
import java.util.*;

public class quiz {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input salary : ");
        int salary_input = scanner.nextInt();
        System.out.print("Input member of family : ");
        int member_input = scanner.nextInt();
        
        double tax = salary_input * 0.07;
        int assurance = 27000;
        double member = member_input * assurance;
        double net_salary = salary_input - member - tax;

        System.out.println("The net salaries  = " + net_salary);


    }
}
