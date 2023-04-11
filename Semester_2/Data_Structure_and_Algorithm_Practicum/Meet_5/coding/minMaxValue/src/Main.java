import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int amount;
        System.out.print("Insert amount of number : ");
        amount = scanner.nextInt();
        MinMax minMax = new MinMax(amount);

        for (int i = 0; i < amount; i++) {
            System.out.print("Insert number : ");
            minMax.number[i] = scanner.nextInt();
        }
        System.out.println();

        for (int i = 0; i < amount; i++) {
            System.out.print(minMax.number[i] + " ");
        }
        System.out.println();

        int [] minMaxBruteForce = minMax.findMinMaxBruteForce(minMax.number);

        System.out.println("\nBrute Force");
        System.out.println("Min value = " + minMaxBruteForce[0] );
        System.out.println("Index min value = " + minMaxBruteForce[1] );
        System.out.println("Max value = " + minMaxBruteForce[2] );
        System.out.println("Index max value = " + minMaxBruteForce[3] );

        System.out.println();

        System.out.println("Divide and Conquer");
        int [] minMaxDivideConquer = minMax.findMinMaxDivideConquer(minMax.number, 0, minMax.number.length-1);
        System.out.println("Min value = " + minMaxDivideConquer[0]);
        System.out.println("Index min value = " + minMaxDivideConquer[1]);
        System.out.println("Max value = " + minMaxDivideConquer[2]);
        System.out.println("Index max value = " + minMaxDivideConquer[3]);
        scanner.close();
    }
}
