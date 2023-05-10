import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insert amount of data : ");
        int amount = scanner.nextInt();

        AccountService data = new AccountService(amount);

        for (int i = 0; i < amount; i++) {
            System.out.print("Account Number : ");
            int accountNumber = scanner.nextInt();
            System.out.print("Phone : ");
            int phone = scanner.nextInt();
            System.out.print("Balance : ");
            int balance = scanner.nextInt();
            System.out.print("Name : ");
            String name = scanner.next();
            System.out.print("Mother Name : ");
            String motherName = scanner.next();
            System.out.print("Email : ");
            String email = scanner.next();

            Account account = new Account(accountNumber, phone, name, motherName, email, balance);
            data.add(account);
        }
        System.out.println();

        System.out.println("List of Data");
        data.displayAll();
        System.out.println();

        System.out.println("List of Data that Balance 0");
        data.display0();
        System.out.println();

        System.out.println("List of Data After Sorting");
        data.sort();
        data.displayAll();
        System.out.println();

        System.out.print("Search name : ");
        String search = scanner.next();
        int position = data.search(search);
        System.out.println();

        data.showPosition(search, position);
        System.out.println();
        data.showData(search, position);

        System.out.println();

        System.out.print("Enter account number to withdraw : ");
        int accountNumber = scanner.nextInt();
        System.out.print("Enter amount to withdraw : ");
        double amountToWithdraw = scanner.nextDouble();
        data.withdraw(accountNumber, amountToWithdraw);

        System.out.println();

        System.out.print("Enter account number to deposit : ");
        accountNumber = scanner.nextInt();
        System.out.print("Enter amount to deposit : ");
        double amountToDeposit = scanner.nextDouble();
        data.deposit(accountNumber, amountToDeposit);

        scanner.close();
    }
}
