package num2;

import java.util.Scanner;

public class ReceiptService {
    Scanner scanner = new Scanner(System.in);
    public int size, top;
    Receipt data [];

    public ReceiptService(int size) {
        this.size = size;
        data = new Receipt[size];
        top = -1;
    }

    public int size() {
        return top + 1;
    }

    public boolean isEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull() {
        if (top == size - 1) {
            return true;
        } else {
            return false;
        }
    }

    public void push(Receipt dt) {
        if (!isFull()) {
            top++;
            data[top] = dt;
        } else {
            System.out.println("Data is full");
        }
    }

    public void pop() {
        if (!isEmpty()) {
            Receipt receipt = data[top];
            top--;
            System.out.println("Exchanging : " + receipt.id + " " + receipt.qty + " " + receipt.total + " " + receipt.date);
        } else {
            System.out.println("Data is empty");
        }
    }

    public void print() {
        System.out.println("Receipt");
        for (int i = top; i >=0; i--) {
            System.out.println(data[i].id + " " + data[i].qty + " " + data[i].total + " " + data[i].date);
        }
    }

    public void add(ReceiptService receiptService) {
        String choose;
        do {
            System.out.print("Transaction ID : ");
            int id = scanner.nextInt();
            System.out.print("Item Quantity : ");
            int qty = scanner.nextInt();
            System.out.print("Total Price : ");
            int total = scanner.nextInt();
            System.out.print("Date : ");
            String date = scanner.next();

            Receipt receipt = new Receipt(id, qty, total, date);
            System.out.print("Do you want to add new receipt (y/n) ? ");
            choose = scanner.next();
            scanner.nextLine();
            receiptService.push(receipt);
            
        } while (choose.equalsIgnoreCase("y"));
    }

    public void trade() {
        if (!isEmpty()) {
            for (int i = 0; i < 5; i++) {
                pop();
            }
            System.out.println("You have traded your 5 receipts");
            System.out.println("You got 1 voucher");
        } else {
            System.out.println("You don't have any receipts");
        }
    }

    public void tradeReceipt(ReceiptService receiptService) {
        String choose;
        if (receiptService.size() >= 5) {
            System.out.println("You have enough to trade, your total receipts is " + receiptService.size());
            System.out.print("Do you want to trade your receipts (y/n) ? ");
            choose = scanner.next();
            if (choose.equalsIgnoreCase("y")) {
                trade();
            } else {
                System.out.println("Data is closed");
            }
        }
    }
}
