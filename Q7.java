//•	Array of objects (Students)
import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner myscanner= new Scanner(System.in);
        System.out.println("Enter Students Id , Name , Major");
        Student number[]= new Student[3];
        for (int i = 0; i <number.length ; i++) {
            number[i]=new Student(myscanner.nextInt(),myscanner.next(),myscanner.next());
        }
        for (int i = 0; i < number.length; i++) {
            System.out.println(number[i]);
        }


    }
}
