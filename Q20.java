//Modify the declaration of the first for loop in the main method in Code Fragment 1.6 so that its charges will
//cause exactly one of the threecredit cards to attempt to go over its credit limit.Which credit card is it?

public class Q20 {public static void main(String[] args) {
    CreditCardQ20 card1 = new CreditCardQ20("Ali", 5000);  
    CreditCardQ20 card2 = new CreditCardQ20("Ahmed", 3000);
    CreditCardQ20 card3 = new CreditCardQ20("Ibrahim", 2000);


    for (int i = 0; i < 8; i++) {
        card1.charge(600);
        card2.charge(400);
        card3.charge(300);
    }


    System.out.println(card1);
    System.out.println(card2);
    System.out.println(card3);
}
}

