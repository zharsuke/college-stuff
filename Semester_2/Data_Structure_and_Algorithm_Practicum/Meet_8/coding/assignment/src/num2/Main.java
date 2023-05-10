package num2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ReceiptService receiptService = new ReceiptService(15);
        Receipt receipt1 = new Receipt(1, 1, 250000, "04-10-2023");
        Receipt receipt2 = new Receipt(2, 2, 150000, "04-11-2023");
        Receipt receipt3 = new Receipt(3, 3, 350000, "04-12-2023");
        Receipt receipt4 = new Receipt(4, 4, 450000, "04-13-2023");
        Receipt receipt5 = new Receipt(5, 5, 650000, "04-14-2023");
        Receipt receipt6 = new Receipt(6, 6, 550000, "04-15-2023");
        Receipt receipt7 = new Receipt(7, 7, 750000, "04-16-2023");
        Receipt receipt8 = new Receipt(8, 8, 850000, "04-17-2023");

        receiptService.push(receipt1);
        receiptService.push(receipt2);
        receiptService.push(receipt3);
        receiptService.push(receipt4);
        receiptService.push(receipt5);
        receiptService.push(receipt6);
        receiptService.push(receipt7);
        receiptService.push(receipt8);

        int choose;
        do {
            receiptService.print();
            System.out.println("Wardrobe Options");
            System.out.println("1. Add receipts");
            System.out.println("2. Trade your receipts");
            System.out.println("3. Exit");
            System.out.print("Choose : ");
            choose = scanner.nextInt();

            switch (choose) {
                case 1:
                    receiptService.add(receiptService);
                    break;
                case 2:
                    receiptService.tradeReceipt(receiptService);
                    break;
                case 3:
                    System.out.println("Wardrobe is closed");
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        } while (choose != 3);

        scanner.close();
    }
}
