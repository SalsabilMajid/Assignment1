//Write a short Java method, isEven, that takes an int i and returns true if and only if i is even.
// Your method cannot use the multiplication, modulus, or division operators, however.

public class Q11 {
    public static boolean isEven(int i) {
        return (i & 1) == 0;
    }
    public static void main(String[] args) {

        System.out.println(isEven(3));
        System.out.println(isEven(8));
        System.out.println(isEven(0));
        System.out.println(isEven(-4));
        System.out.println(isEven(-5));
    }
}
