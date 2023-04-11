public class Payroll {
    // init attribute
    public String payrollId, employeeId, employeeName, level;
    public int baseSalary;
    public int [] allowance = new int [4];
    public boolean isPermanent;

    // create constructor
    Payroll(String payrrollId, String employeeId, String employeeName, String level, boolean isPermanent) {
        this.payrollId = payrrollId;
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.level = level;
        this.isPermanent = isPermanent;
    }

    // calculate total allowance
    public int calTotalAllowance() {
        int result = 0;
        if (level.equalsIgnoreCase("3A")) {
            result += allowance[0] = 50000;
        } else if (level.equalsIgnoreCase("3B")) {
            result += allowance[1] = 100000;
        } else if (level.equalsIgnoreCase("3C")) {
            result += allowance[2] = 150000;
        } else if (level.equalsIgnoreCase("4A")) {
            result += allowance[3] = 200000;
        }
        return result;
    }

    // calculate base salary
    public int calBaseSalary() {
        if (level.equalsIgnoreCase("3A")) {
            baseSalary += 2_000_000;
        } else if (level.equalsIgnoreCase("3B")) {
            baseSalary += 2_500_000;
        } else if (level.equalsIgnoreCase("3C")) {
            baseSalary += 3_000_000;
        } else if (level.equalsIgnoreCase("4A")) {
            baseSalary += 3_750_000;
        } else {
            System.out.println("Invalid inout!!!");
        }
        return baseSalary;
    }

    // calculate health benefit
    public int calHealthBenefit() {
        double percent;
        double total = 0;
        if (isPermanent == true && level.equalsIgnoreCase("3A")) {
            percent = baseSalary * 0.05;
            total = baseSalary + percent;
        } else if (isPermanent == true && level.equalsIgnoreCase("3B")) {
            percent = baseSalary * 0.07;
            total = baseSalary + percent;
        } else if (isPermanent == true && level.equalsIgnoreCase("3C")) {
            percent = baseSalary * 0.09;
            total = baseSalary + percent;
        } else if (isPermanent == true && level.equalsIgnoreCase("4A")) {
            percent = baseSalary * 0.11;
            total = baseSalary + percent;
        }
        int totalToInt = (int)total;
        return totalToInt;
    }

    // calculate total salary
    public int calTotalSalary() {
        return calTotalAllowance() + calBaseSalary() + calHealthBenefit();
    }

    public void display() {
        System.out.println("Total salary = " + calBaseSalary());
    }
}
