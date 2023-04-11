import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int amount;
        System.out.print("Insert amount of candidate : ");
        amount = scanner.nextInt();
        Candidates candidates = new Candidates(amount);

        for (int i = 0; i < amount; i++) {
            System.out.print("Insert name of voting result : " + (i+1) + " = ");
            candidates.candidates[i] = scanner.next();
        }
        System.out.println();

        System.out.println("The highest election sort from highest voting = " + candidates.divideConquer(candidates.candidates, 0, candidates.amount-1));
        System.out.println("The winner voting = " + candidates.getHighest());

        scanner.close();
    }
}
