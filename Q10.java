//Write a short Java method, isMultiple, that takes two long values,
//n and m, and returns true if and only if n is a multiple of m,that is, n = mi for some integer i.

public class Q10 {
    public static boolean isMultiple(long n, long m) {

        if (m == 0) {

            throw new IllegalArgumentException("The divisor (m) cannot be zero.");
        }
        return n % m == 0;
    }
    public static void main(String[] args) {
        System.out.println(isMultiple(10, 2));
        System.out.println(isMultiple(15, 4));
        //System.out.println(isMultiple(20, 0));
    };
}

