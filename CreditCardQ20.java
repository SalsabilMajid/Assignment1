public class CreditCardQ20 {
    private String name;
    private double limit;
    private double balance;

    // مُنشئ الكلاس
    public CreditCardQ20(String name, double limit) {
        this.name = name;
        this.limit = limit;
        this.balance = 0;  // البداية برصيد صفر
    }

    // شحن البطاقة
    public void charge(double amount) {
        balance += amount;
        if (balance > limit) {
            System.out.println(name + " has exceeded the credit limit!");
        }
    }

    // طباعة معلومات البطاقة
    @Override
    public String toString() {
        return "Card Holder: " + name + ", Balance: " + balance + ", Limit: " + limit;
    }
}
