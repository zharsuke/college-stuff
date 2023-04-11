import java.util.*;

public class quiz2 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int total_stock, total_damaged, total_goods, total_price_goods, total_turnover;

        int[] price = {20_000, 5_000, 5_000_000};

        String[] product = {"Book", "Pencil", "Computer"};

        int [][] stock = new int[3][2];

        total_stock = 0;
        total_damaged = 0;
        total_goods = 0;



        for (int i = 0; i < stock.length; i++) {
            for (int j = 0; j < stock[i].length; j++) {
                System.out.print("Insert number array = [" + i + "] [" + j + "] : ");
                stock[i][j] = scanner.nextInt();
                total_damaged += stock[i][1];
            }
            System.out.println();
        }

        

        System.out.println();

        for (int i = 0; i < stock.length; i++) {
            System.out.print(product[i] + " = ");
            for (int j = 0; j < stock[i].length; j++) {
                if (j > 0 && j < stock[i].length) {
                    System.out.print(", ");
                }
                System.out.print(stock[i][j]);
            }
            System.out.print("\n");
        }
        total_price_goods = 0;

        for (int i = 0; i < stock.length; i++) {
            total_stock += stock[i][0];
            total_turnover = stock[i][0] - stock[i][1];
            total_price_goods = total_turnover * price[i];
        }

        total_goods = total_stock - total_damaged;

        int maxNum = stock[0][0];

        for (int i = 0; i < stock.length; i++) {
            for (int j = 0; j < stock[i].length; j++) {
                if (stock[i][0] > maxNum) {
                    maxNum = stock[i][0];
                }
            }
        }

        System.out.println("B. Total stocks good that can be borrowed = " + total_goods);
        System.out.printf("C. Total turnover = %,d\n", total_price_goods);
        System.out.println("D. Name of the item with the most stock items that can be borrowed = " + maxNum);

    }
}
