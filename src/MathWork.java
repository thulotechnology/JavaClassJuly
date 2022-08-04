public class MathWork {
    public static void main(String[] args) {
        int n1 = 50;
        int n2 = 60;
        double n3 = 35.9;
        int max = Math.max(n1,n2);
        int min = Math.min(n1,n2);
        double round = Math.round(n3);
        double floor = Math.floor(n3);
        double ceil = Math.ceil(n3);
        System.out.println("The max number is " +max);
        System.out.println("The min number is "+min);
        System.out.println("The round number is "+round);
        System.out.println("The floor number is "+floor);
        System.out.println("The ceil number is "+ceil);
    }
}
// Find the floor and ceil value of 85.56 and 65.2
