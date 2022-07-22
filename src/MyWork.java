import java.util.Scanner;

public class MyWork {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your age: ");
        int age = sc.nextInt();

        int birthYear = 2022- age;

        System.out.println("Your Birth Year is "+ birthYear);
    }
}
