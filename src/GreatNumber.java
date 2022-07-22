public class GreatNumber {
    public static void main(String[] args) {
        int num1 = 100;
        int num2 = 300;
        int num3 = 800;

        // If num1 > num2 and num1 > num3 => Num1 is great
        // If num2 > num1 and num2 > num3 => Num2 is great
        // If num3 > num1 and num3 > num2 => Num3 is great

        if(num1 > num2 && num1 > num3){
            System.out.println("Num1 is great.");
        }else if(num2 > num1 && num2 > num3){
            System.out.println("Num2 is great.");
        }else if(num3 > num1 && num3 > num2){
            System.out.println("Num3 is great.");
        }

    }
}
