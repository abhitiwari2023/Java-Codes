package loops;

/**
 * This is the Example of For Loop
 *
 * @author Abhishek Tiwari
 */
public class ForLoopEx {
    public static void main(String[] args) {
        int num = 1;

        while (num < 11) {
            // I want to print table from 1 to 10 using simple for loop
            for (int i = 1; i <= 10; i++) {
                System.out.print(i * num + "\t");
            }
            num++;
            System.out.println();
        }
    }
}
