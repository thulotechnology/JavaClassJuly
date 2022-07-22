import java.util.Scanner;

public class VariableSwap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter num1: ");
        int num1 = sc.nextInt();
        System.out.println("Enter num2: ");
        int num2 = sc.nextInt();

        // Swap
        int temp = num1;
        num1 = num2;
        num2 = temp;

        // Display
        System.out.println("Num1 is "+num1);
        System.out.println("Num2 is "+num2);
    }


}
