public class ass1 {
    public static void main(String[] args) {
        double costPerKg = 4_500;
        double [] amountClothes = {4, 15, 6, 11};
        String [] customers = {"Ani", "Budi", "Bina", "Cita"};
        double totalIncome = 0;
        double discount = 0.05;

        for (int i = 0; i < amountClothes.length; i++) {
            double clothes = amountClothes[i];
            double cost = clothes * costPerKg;
            if (clothes > 10) {
                cost *= discount;
            }
            System.out.printf("%s's cost = %,.2f\n", customers[i], cost);
            totalIncome += cost;
        }
        System.out.printf("Total = %,.2f\n", totalIncome);
    }
}
