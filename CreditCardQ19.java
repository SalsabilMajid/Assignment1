public class CreditCardQ19 {
    private String customer;  // name of the customer
    private String bank;      // name of the bank
    private String account;   // account identifier
    private int limit;        // credit limit
    protected double balance; // current balance

    // Constructor
    public CreditCardQ19(String cust, String bk, String acct, int lim, double initialBal) {
        customer = cust;
        bank = bk;
        account = acct;
        limit = lim;
        balance = initialBal;
    }

    public CreditCardQ19(String cust, String bk, String acct, int lim) {
        this(cust, bk, acct, lim, 0.0); // use a balance of zero as default
    }

    // Accessor methods
    public String getCustomer() { return customer; }
    public String getBank() { return bank; }
    public String getAccount() { return account; }
    public int getLimit() { return limit; }
    public double getBalance() { return balance; }

    // Charge method
    public boolean charge(double price) {
        if (price + balance > limit) {
            return false; // charge was denied
        }
        balance += price;
        return true; // charge was successful
    }

    // Payment method
    public void makePayment(double amount) {
        if (amount < 0) {
            System.out.println("Error: Cannot process negative payment amount.");
            return; // Ignore negative payments
        }
        balance -= amount;
    }

    // Utility method to display card information
    public static void printSummary(CreditCardQ19 card) {
        System.out.println("Customer: " + card.customer);
        System.out.println("Bank: " + card.bank);
        System.out.println("Account: " + card.account);
        System.out.println("Balance: " + card.balance);
        System.out.println("Limit: " + card.limit);
    }
}
