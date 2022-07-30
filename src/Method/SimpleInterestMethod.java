package Method;

public class SimpleInterestMethod {
    public static void main(String[] args) {
        findInterest(1000,5, 2);
        findInterest(5000,5, 6);
    }

    public static void findInterest(int p, int r, int t){
        double si = p * t * r / 100;
        System.out.println("The simple interest is "+si);
    }
}
// WAP IN JAVA WHICH FIND SUM OF TWO NUMBERS USING METHODS
