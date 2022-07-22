public class IfElseIf {
    public static void main(String[] args) {
        // WAP program prints 1 for jan, 2 for feb... and 12 for dec. // 3 Minutes
        int noOfDay = 17;
        if(noOfDay == 1){
            System.out.println("The day is sunday.");
        }else if(noOfDay == 2){
            System.out.println("The day is monday.");
        }else if(noOfDay == 3){
            System.out.println("The day is tuesday.");
        }else if(noOfDay == 4){
            System.out.println("The day is wednesday.");
        }else if(noOfDay == 5){
            System.out.println("The day is thursday.");
        }else if(noOfDay == 6){
            System.out.println("The day is friday.");
        }else if(noOfDay == 7){
            System.out.println("The day is saturday.");
        }else{
            System.out.println("Invalid Day");
        }
    }
}
