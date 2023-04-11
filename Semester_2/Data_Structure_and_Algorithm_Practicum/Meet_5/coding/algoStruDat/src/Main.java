import java.util.*;

import Week3.Factorial;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insert number of elements you want to count : ");
        int num = scanner.nextInt();
        Factorial[] factorials = new Factorial[num];
        for (int i = 0; i < factorials.length; i++) {
            factorials[i] = new Factorial();
            System.out.print("Input data value to-" + (i+1) + " : ");
            factorials[i].num = scanner.nextInt();
        }
        System.out.println();
        System.out.println("Factorial results with brute force");
        for (int i = 0; i < num; i++) {
            System.out.println("Factorial of value " + factorials[i].num + " is : " + factorials[i].factorialBF(factorials[i].num));
        }
        System.out.println();
        System.out.println("Factorial result with divide and conquer");
        for (int i = 0; i < num; i++) {
            System.out.println("Factorial of value " + factorials[i].num + " is : " + factorials[i].factorialDC(factorials[i].num));
        }
        scanner.close();
        
    }
}

