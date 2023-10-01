package AssNum4;

public class Member {
    private int numberIdentity;
    private String name;
    private double limitLoan;
    private double amountLoan;

    Member (int numberIdentity, String name, double limitLoan){
        this.numberIdentity = numberIdentity;
        this.name = name;
        this.limitLoan = limitLoan;
        this.amountLoan = 0;
    }

    public String getName() {
        return name;
    }

    public double getLimitLoan() {
        return limitLoan;
    }

    public double getAmountLoan() {
        return amountLoan;
    }

    public double minInstallment() {
        return amountLoan * 0.1;
    }

    public void installment(double money) {
        if (amountLoan < 0) {
            System.out.println("You don't have loan! great!");
        } else {
            if (money > minInstallment()) {
                amountLoan -= money;
            } else {
                System.out.println("Sorry, the installment must be more than 10% of the loan");
            }
        }
    }

    public void loan(double money) {
        if ((money + amountLoan) > limitLoan) {
            System.out.println("Sorry, amount loan is more than limit loan");
        } else {
            amountLoan += money;
        }
    }
}
