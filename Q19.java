//Modify the CreditCard class from Code Fragment 1.5 so that it ignores any
// request to process a negative payment amount.

public class Q19 {public static void main(String[] args) {
    CreditCardQ19 card = new CreditCardQ19("Haitam Maje", "Bank HMQ", "1234 5678 9876 5432", 5000, 1000);
    card.makePayment(200);
    card.makePayment(-50);
    CreditCardQ19.printSummary(card);
}
}




