public class SwitchCase3 {
    // WAP IN JAVA THAT PRINT MONTH NUMBER BASED ON MONTH NAME: 3 Min

    public static void main(String[] args) {
        String weather = "snowy";
        switch (weather){
            case "sunny":
                System.out.println("Its sunny day. Put sunscreen.");
                break;
            case "snowy":
                System.out.println("Get your skis.");
                break;
            case "cloudy":
            case "rainy":
                System.out.println("Please bring umbrella");
                break;
            default:
                System.out.println("Sorry I am not able to detect that weather.");
        }
    }
}

