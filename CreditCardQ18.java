public class CreditCardQ18 {

    private String customer;
    private String bank;
    private String account;
    private double balance;
    private double creditLimit;


    public CreditCardQ18(String cust, String bk, String acnt, double lim, double initialBal) {
        customer = cust;
        bank = bk;
        account = acnt;
        creditLimit = lim;
        balance = initialBal;
    }


    public String getCustomer() {
        return customer;
    }

    public String getBank() {
        return bank;
    }

    public String getAccount() {
        return account;
    }

    public double getBalance() {
        return balance;
    }

    public double getCreditLimit() {
        return creditLimit;
    }


    public boolean charge(double price) {
        if (price + balance > creditLimit) { // If charge exceeds limit
            return false;
        }
        balance += price;
        return true;
    }


    public void makePayment(double amount) {
        balance -= amount;
    }


    public void updateCreditLimit(double newLimit) {
        creditLimit = newLimit;
    }


}
