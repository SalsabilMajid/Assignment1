//Write a short Java method that takes an integer n and returns the sum
//of all positive integers less than or equal to n.

public class Q12 {
    public static int sumOfNumbers(int n) {
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        return sum;
    }
    public static void main(String[] args) {
        System.out.println(sumOfNumbers(5));
        System.out.println(sumOfNumbers(3));
    }
}
