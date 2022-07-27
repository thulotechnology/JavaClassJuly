// Step 1: import
import java.util.Scanner;
public class CubeFinder {
    // This program find cube of a number

    public static void main(String[] args) {
        // Step 2: Create object of Scanner Class
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number: ");
        int num = sc.nextInt();

        int cube = num * num * num;

        System.out.println("The cube of number is "+cube);
    }
}
