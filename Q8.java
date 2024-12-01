//Write a short Java method, inputAllBaseTypes, that inputs a different value
//of each base type from the standard input device and printsit back to the standard output device.

import java.util.Scanner;
public class Q8 {
    public static void inputAllBaseTypes() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a value of type byte: ");
        byte byteValue = scanner.nextByte();
        System.out.println("The byte value you entered is: " + byteValue);

        System.out.print("Enter a value of type short: ");
        short shortValue = scanner.nextShort();
        System.out.println("The short value you entered is: " + shortValue);

        System.out.print("Enter a value of type int: ");
        int intValue = scanner.nextInt();
        System.out.println("The int value you entered is: " + intValue);

        System.out.print("Enter a value of type long: ");
        long longValue = scanner.nextLong();
        System.out.println("The long value you entered is: " + longValue);

        System.out.print("Enter a value of type float: ");
        float floatValue = scanner.nextFloat();
        System.out.println("The float value you entered is: " + floatValue);

        System.out.print("Enter a value of type double: ");
        double doubleValue = scanner.nextDouble();
        System.out.println("The double value you entered is: " + doubleValue);

        System.out.print("Enter a single character (char): ");
        char charValue = scanner.next().charAt(0);
        System.out.println("The char value you entered is: " + charValue);

        System.out.print("Enter a value of type boolean (true/false): ");
        boolean booleanValue = scanner.nextBoolean();
        System.out.println("The boolean value you entered is: " + booleanValue);

    }

    public static void main(String[] args) {
        inputAllBaseTypes();
    }
}



