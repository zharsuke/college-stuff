import java.util.*;

public class ass1 {

    static int Max3(int num1, int num2, int num3) {
        int maxNum = 0;
        if (num1 > num2 && num1 > num3) {
            maxNum = num1;
            System.out.println("The Largest number = " + maxNum);
        } else if (num2 > num3) {
            maxNum = num2;
            System.out.println("The largest number = " + maxNum);
        } else {
            maxNum = num3;
            System.out.println("The largest number = " + num3);
        }
        return maxNum;
    }

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int num1, num2, num3;

        System.out.print("Insert number 1 : ");
        num1 = scanner.nextInt();
        System.out.print("Insert number 2 : ");
        num2 = scanner.nextInt();
        System.out.print("Insert number 3 : ");
        num3 = scanner.nextInt();

        Max3(num1, num2, num3);

        scanner.close();
    }
}