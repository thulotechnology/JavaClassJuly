public class IfElseIf {
    public static void main(String[] args) {
        // WAP program prints 1 for jan, 2 for feb... and 12 for dec. // 3 Minutes
        int nd = 17;
        if(nd == 1){
            System.out.println("The day is sunday.");
        }else if(nd == 2){
            System.out.println("The day is monday.");
        }else if(nd == 3){
            System.out.println("The day is tuesday.");
        }else if(nd == 4){
            System.out.println("The day is wednesday.");
        }else if(nd == 5){
            System.out.println("The day is thursday.");
        }else if(nd == 6){
            System.out.println("The day is friday.");
        }else if(nd == 7){
            System.out.println("The day is saturday.");
        }else{
            System.out.println("Invalid Day");
        }
    }
}
