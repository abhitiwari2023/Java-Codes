//Take a number as input and print the multiplication table for it.
import java.util.Scanner;
public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter The Number : ");
        long number = in.nextLong();
        for (int i = 1; i<=10;i++){
            System.out.println(number*i);
        }
    }
}
