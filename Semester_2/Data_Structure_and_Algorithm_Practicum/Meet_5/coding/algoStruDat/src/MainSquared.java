import java.util.*;

import Week3.Squared;

public class MainSquared {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the number of elements you wants to count : ");
        int num = scanner.nextInt();
        Squared [] squareds = new Squared[num];
        for (int i = 0; i < num; i++) {
            squareds[i] = new Squared();
            System.out.print("Input the value to be squared to-" + (i+1) + " : ");
            squareds[i].num = scanner.nextInt();
            System.out.print("Input the squared value to-" + (i+1) + " : ");
            squareds[i].squared = scanner.nextInt();
        }
        System.out.println();
        System.out.println("Result with brute force squared");
        for (int i = 0; i < num; i++) {
            System.out.println("Value " + squareds[i].num + " squared " + squareds[i].squared + " is " + squareds[i].squaredBF(squareds[i].num, squareds[i].squared));
        }
        System.out.println();
        System.out.println("Result with divide and conquer squared");
        for (int i = 0; i < num; i++) {
            System.out.println("Value " + squareds[i].num + " squared " + squareds[i].squared + " is " + squareds[i].squaredDC(squareds[i].num, squareds[i].squared));
        }
        scanner.close();
    }
}
