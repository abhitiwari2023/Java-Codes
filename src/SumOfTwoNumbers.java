/*Take two numbers and print the sum of both.*/

import java.util.Scanner;
public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Your First Number : ");
        long number1 = in.nextLong();
        System.out.print("Enter Your Second Number : ");
        long number2 = in.nextLong();
        System.out.println("The Sum Of Number1 & Number2 is : "+number1+number2);
    }
}