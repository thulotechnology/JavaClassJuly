import java.util.Scanner;
public class StringCondition {
    public static void main(String[] args) {
        // We are giving discount to 2 states i.e  Ohio & New York
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter your state: ");
        String personState = sc.nextLine();
        if(personState.equals("Ohio") || personState.equals("New York")){
            System.out.println("You are eligible for 10% discount.");
        }else{
            System.out.println("You are not eligible for discount.");
        }


    }
}
