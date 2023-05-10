public class AccountService {
    Account [] accounts;
    int index;

    public AccountService(int amount) {
        accounts = new Account[amount];
    }

    public void add(Account account) {
        if (index < accounts.length) {
            accounts[index] = account;
            index++;
        }
    }

    public void displayAll() {
        for (Account account : accounts) {
            account.print();
            System.out.println();
            System.out.println("==================================");
        }
    }

    public void sort() {
        for (int i = 0; i < accounts.length-1; i++) {
            for (int j = 1; j < accounts.length-i; j++) {
                if (accounts[j].balance > accounts[j-1].balance) {
                    // swap
                    Account tmp = accounts[j];
                    accounts[j] = accounts[j-1];
                    accounts[j-1] = tmp;
                }
            }
        }
    }

    public void display0() {
        for (Account account : accounts) {
            if (account.balance == 0) {
                account.print();
                System.out.println();
                System.out.println("==================================");
            }
        }
    }

    public int search(String search) {
        int position = -1;
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i].name.equalsIgnoreCase(search)) {
                position = i;
                break;
            }
        }
        return position;
    }

    public void showPosition(String x, int pos) {
        if (pos != -1) {
            System.out.println("Data : " + x + " is found in index-" + pos);
        } else {
            System.out.println("Data : " + x + " is not found!");
        }
    }

    public void showData(String x, int pos) {
        if (pos != -1) {
            System.out.println("Account number \t = " + accounts[pos].accountNumber);
            System.out.println("Phone \t = " + accounts[pos].phone);
            System.out.println("Balance \t = " + accounts[pos].balance);
            System.out.println("Name \t = " + x);
            System.out.println("Mother Name \t = " + accounts[pos].motherName);
            System.out.println("Email \t = " + accounts[pos].email);
        } else {
            System.out.println("Data " + x + " is not found!");
        }
    }

    public void withdraw(int accountNumber, double amount) {
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i].accountNumber == accountNumber) {
                if (accounts[i].balance >= amount) {
                    accounts[i].balance -= amount;
                    System.out.println("Withdrawal successful. New balance: " + accounts[i].balance);
                } else {
                    System.out.println("Insufficient balance.");
                }
                return;
            }
        }
        System.out.println("Account not found.");
    }
    
    public void deposit(int accountNumber, double amount) {
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i].accountNumber == accountNumber) {
                accounts[i].balance += amount;
                System.out.println("Deposit successful. New balance: " + accounts[i].balance);
                return;
            }
        }
        System.out.println("Account not found.");
    }
    
}
