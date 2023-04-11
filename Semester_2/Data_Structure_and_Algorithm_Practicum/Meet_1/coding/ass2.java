public class ass2 {
    public static void main(String[] args) {
        double money = 1_000_000;
        double interestRate = 0.02;
        int months = 0;

        while (money < 1_500_000) {
            money *= (1 + interestRate);
            months++;
        }
        System.out.printf("The money reaches 1.5 million in %d months\n", months);
    }
}
