import java.util.Scanner;
public class FullName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first name: ");
        String firstName = sc.nextLine();

        System.out.println("Enter last name: ");
        String lastName = sc.nextLine();

        String fullName = firstName.concat(" "+ lastName);
        System.out.println("Hello "+fullName);
    }
}
