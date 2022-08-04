public class FunctionWork3 {
    public static void main(String[] args) {
    // What is 10666, 4, 5: arguments
        calculateInterest(10666,4,5);
       double result =  calculateInterest1(2000,4,5);
        System.out.println(result+50);
    }
// What is p, t, r: Parameter
    public static void calculateInterest(double p, double t, double r){
        double interest = p *t *r / 100;
        System.out.println("The simple interest is "+interest);
    }
    public static double calculateInterest1(double p, double t, double r){
        double interest = p *t *r / 100;
       return interest;
    }
}
