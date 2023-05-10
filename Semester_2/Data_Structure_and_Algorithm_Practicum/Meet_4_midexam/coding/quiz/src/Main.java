import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Payroll [] payrolls = new Payroll[5];
        boolean isPermanent;
        String payrollId, employeeId, employeeName, level;
        int totalSalary = 0, avg = 0;


        for (int i = 0; i < 5; i++) {
            System.out.print("Insert payroll id : ");
            payrollId = scanner.next();
            System.out.print("Insert employee id : ");
            employeeId = scanner.next();
            System.out.print("Insert employee name : ");
            employeeName = scanner.next();
            System.out.print("Insert level (3A, 3B, 3C, 4A) : ");
            level = scanner.next();
            if (i % 2 == 0) {
                isPermanent = true;
            } else {
                isPermanent = false;
            }
            payrolls[i] = new Payroll(payrollId, employeeId, employeeName, level, isPermanent);
        }

        for (int i = 0; i < 5; i++) {
            if (payrolls[i].level.equalsIgnoreCase("4A")) {
                System.out.println("Payroll id = " + payrolls[i].payrollId);
                System.out.println("Employee id = " + payrolls[i].employeeId);
                System.out.println("Employee name = " + payrolls[i].employeeName);
                System.out.println("Level = " + payrolls[i].level);
                System.out.println("Total salary = " + payrolls[i].calTotalSalary());
                totalSalary += payrolls[i].calTotalSalary();
                System.out.println();
            }
        }

        avg = totalSalary / 5;

        System.out.println("Average of total salary 4A employee = " + avg);

        int biggestSalary = payrolls[0].calTotalSalary();
        String maxName = "";
        String idMax = "";

        for (int i = 0; i < 5; i++) {
            if (payrolls[i].calTotalSalary() > biggestSalary) {
                biggestSalary = payrolls[i].calTotalSalary();
                maxName = payrolls[i].employeeName;
                idMax = payrolls[i].employeeId;
            }
        }

        System.out.println();
        System.out.println("Biggest");
        System.out.println("Employee id = " + idMax);
        System.out.println("Employee name = " + maxName);
        System.out.println("Total salary = " + biggestSalary);

        System.out.println();

        int totalHealth = 0;

        for (int i = 0; i < 5; i++) {
            if (payrolls[i].isPermanent == true) {
                totalHealth += payrolls[i].calHealthBenefit();
            }
        }

        System.out.println("Total Health = " + totalHealth);

    }
}
