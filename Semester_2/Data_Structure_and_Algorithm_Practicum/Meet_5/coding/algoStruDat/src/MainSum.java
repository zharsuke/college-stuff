import java.util.*;

import Week3.Sum;

public class MainSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insert number of months : ");
        int totElement = scanner.nextInt();
        Sum sm = new Sum(totElement);
        sm.element = totElement;
        for (int i = 0; i < sm.element; i++) {
            System.out.print("Insert the profit of the month to-" + (i+1) + " = ");
            sm.profit[i] = scanner.nextDouble();
        }
        System.out.println();
        System.out.println("Brute force algotithm");
        System.out.println("Total profit of the company for " + sm.element + " month is = " + sm.totalBF(sm.profit));
        System.out.println();
        System.out.println("Divide conquer algorithm");
        System.out.println("Total profit of the company for " + sm.element + " month is = " + sm.totalDC(sm.profit, 0, sm.element-1));
        scanner.close();
    }
}
