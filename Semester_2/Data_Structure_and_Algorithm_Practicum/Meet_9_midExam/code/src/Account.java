public class Account {
    public int accountNumber, phone;
    public String name, motherName, email;
    public double balance;

    public Account(int accountNumber, int phone, String name, String motherName, String email, double balance) {
        this.accountNumber = accountNumber;
        this.phone = phone;
        this.name = name;
        this.motherName = motherName;
        this.email = email;
        this.balance = balance;
    }

    public void print() {
        System.out.println("Account Number = " + accountNumber);
        System.out.println("Phone = " + phone);
        System.out.println("Name = " + name);
        System.out.println("Mother Name = " + motherName);
        System.out.println("Email = " + email);
        System.out.println("Balance = " + balance);
    }
}
