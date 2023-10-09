// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

import java.util.Scanner;
public class fMain {
    public static void main(String[] args) {
        int i = 0;
        int nextInt = 0;

        Scanner inScanner = new Scanner(System.in);

        int[] numbers = new int[100];

        System.out.println("Enter values (-1 to stop)");
        nextInt = inScanner.nextInt();

        while (nextInt >= 0) {
            numbers[i] = nextInt;
            i++;
            nextInt = inScanner.nextInt();
        }
        System.out.println(i);
        System.out.println("Your values reversed:");

        i = i - 1;

        while (i >= 0 ) {
            System.out.println(numbers[i]);
            i--;
        }
    }
}