//Write a short Java method that takes an integer n and returns the sum of the squares
// of all positive integers less than or equal to n.

public class Q14 {

    public static int sumOfSquares(int n) {
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i * i;
        }

        return sum;
    }
    public static void main(String[] args) {
        System.out.println(sumOfSquares(3));
        System.out.println(sumOfSquares(4));
    }
}
