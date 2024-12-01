//Modify the CreditCard class from Code Fragment 1.5 to include a method that updates the credit limit
public class Q18 {public static void main(String[] args) {

    CreditCardQ18 card = new CreditCardQ18("Haitam Majed", "Bank HMQ", "1234 5678 9012 3456", 5000, 1000);


        System.out.println("Customer: " + card.getCustomer());
        System.out.println("Bank: " + card.getBank());
        System.out.println("Account: " + card.getAccount());
        System.out.println("Balance: $" + card.getBalance());
        System.out.println("Credit Limit: $" + card.getCreditLimit());


        card.updateCreditLimit(7000);


        System.out.println("\nUpdated Credit Limit: $" + card.getCreditLimit());



}}








