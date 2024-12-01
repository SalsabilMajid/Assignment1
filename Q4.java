//•	Input array elements

import java.util.Scanner;

public class Q4 {public static void main(String[] args){

    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the number : ");
    int numbers[]=new int[5];
    for (int i = 0; i < 5; i++) {
        numbers[i] = scanner.nextInt();
    }

    for (int number : numbers) {
        System.out.println(number);
    }
}
}
