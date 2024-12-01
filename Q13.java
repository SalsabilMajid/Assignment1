//Write a short Java method that takes an integer n and returns
// the sum of all the odd positive integers less than or equal to n.

public class Q13 {
    public static int sumOfOddNumbers(int n) {
        int sum = 0;

        for (int i = 1; i <= n; i += 2) {
            sum += i;
        }

        return sum;
    }
    public static void main(String[] args) {
        System.out.println(sumOfOddNumbers(5));
        System.out.println(sumOfOddNumbers(7));
    }
}
