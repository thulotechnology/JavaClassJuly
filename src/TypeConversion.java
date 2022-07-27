public class TypeConversion {
    public static void main(String[] args) {
        // Converting Data Type to Other

//        int num = 129;
//
//        byte num2 = (byte)num;
//
//        System.out.println(num2);
//        double amount = 5000.3;
//
//        float newAmt = (float)amount;

String nums = "1232983";
double num = Double.parseDouble(nums);
System.out.println(num);

int n = 50;
String no = n+"";


String num1 = "50";
String num2 = "100";

int num3 = Integer.parseInt(num1) + Integer.parseInt(num2);
System.out.println(num3);

if(num1 == "500"){
    System.out.println("Hello");
}

    }
}
