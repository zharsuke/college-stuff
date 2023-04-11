import java.util.*;

public class Assignmentnum2 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        String food_name, choice;
        double price_food, total, shipping_cost = 0;

        System.out.print("Enter a food name : ");
        food_name = scanner.nextLine();
        System.out.print("Enter the price : ");
        price_food = scanner.nextDouble();
        System.out.print("Do you want express delivery (0 = no, 1 = yes) ? ");
        choice = scanner.next();

        if (choice.equals("1")) {
            if (price_food < 100000) {
                shipping_cost = 20000.0 + 25000.0;
            } else if (price_food >= 100000) {
                shipping_cost = 30000.0 + 25000.0;
            }
            total =  price_food + shipping_cost;
            System.out.println("========== RECEIPT ==========");
            System.out.println(food_name + "\t:" + price_food);
            System.out.println("Shipping costs \t:" + shipping_cost);
            System.out.println("TOTAL \t\t:" + total);
            System.out.println("=============================");
        } else if (choice.equals("0")) {
            if (price_food < 100000) {
                shipping_cost = 20000;
            } else if (price_food >= 100000) {
                shipping_cost = 30000;
            }
            total =  price_food + shipping_cost;
            System.out.println("========== RECEIPT ==========");
            System.out.println(food_name + "\t:" + price_food);
            System.out.println("Shipping costs \t:" + shipping_cost);
            System.out.println("TOTAL \t\t:" + total);
            System.out.println("=============================");
        } else {
            System.out.println("Invalid input");
        }

    }
}
