public class OperatorWork {
    public static void main(String[] args) {
        int num1 = 500;
        int num2 = 600;
//        System.out.println(num1 == num2); // false
//        System.out.println(num1 > num2); // false
//        System.out.println(num1 < num2); // true
//        System.out.println(num1 <= num2); // true
//        System.out.println(num1 >= num2); // false

        System.out.println(!(num1 < num2 && (num1 >= num2)));


        // int num1 = 500;
        // num1-= 500; // num1 = num1 - 500
        //num1 *= 2;
        //  System.out.println("Value of num1 is "+num1);
    }
}
