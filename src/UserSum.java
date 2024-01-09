/* Keep taking numbers as inputs till the user enters ‘x’,
 after that print sum of all.*/

import java.util.Scanner;

public class UserSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter The Number : ");
        long number = in.nextLong();
        boolean stop = false;
        while (!stop) {
            System.out.println("1. next");
            System.out.println("2. Exit");
            byte input = in.nextByte();
            if (input == 1) {
                System.out.println("Enter The Number : ");
                long newValue = in.nextLong();
                number = number + newValue;
            } else {
                System.out.println("The Sum Of All Inputs IS :" + number);
                stop = true;
            }
        }
    }
}
