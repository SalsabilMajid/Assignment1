//•	Define method to Input array elements

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {

        int number1[]=new int[5];
        enternum(number1);
        print(number1);

    }
    public static void enternum(int[]n)
    {
        Scanner myscanner = new Scanner(System.in);
        System.out.println("Enter the number");
        for(int i=0;i<5;i++){

            n[i]=myscanner.nextInt();

        }

    }
    public static void print(int[] printarry)
    {
        for (int i = 0; i < printarry.length ; i++) {
            System.out.println(printarry[i]);
        }
    }}

