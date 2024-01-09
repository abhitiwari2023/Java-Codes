//Input a year and find whether it is a leap year or not.

import java.util.Scanner;

public class LeepYear {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter The Year : ");
        short year = in.nextShort();
        if (year % 4 == 0) {
            System.out.println(year + " is a Leap Year");
        } else {
            System.out.println(year + " is not a Leap Year");
        }
    }
}
