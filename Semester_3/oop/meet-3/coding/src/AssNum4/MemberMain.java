package AssNum4;

import java.util.Scanner;

public class MemberMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Member donny = new Member(111333444, "Donny", 5_000_000);

        System.out.println("Member Name : " + donny.getName());
        System.out.println("Limit Loan : " + donny.getLimitLoan());

        System.out.print("\nInsert amount of loan : ");
        double loan = scanner.nextDouble();
        donny.loan(loan);
        System.out.println("Amount of loan currently : " + donny.getAmountLoan());
        
        System.out.print("\nInsert amount of loan : ");
        loan = scanner.nextDouble();
        donny.loan(loan);
        System.out.println("Amount of loan currently : " + donny.getAmountLoan());
        
        System.out.print("\nInsert amount of installment : ");
        double installment = scanner.nextDouble();
        donny.installment(installment);
        System.out.print("Amount of loan currently : " + donny.getAmountLoan());
        
        System.out.print("\nInsert amount of installment : ");
        installment = scanner.nextDouble();
        donny.installment(installment);
        System.out.println("Amount of loan currently : " + donny.getAmountLoan());

        scanner.close();
    }
}
