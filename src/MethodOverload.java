public class MethodOverload {
    public static void main(String[] args) {
    add(1,5);
    add(1,5,4);
    add(1.6, 2);
    }

    public static void add(int n1, int n2){
        int sum = n1 + n2;
        System.out.println("The sum is "+sum);
    }
    public static void add(double n1, int n2){
        double sum = n1 + n2;
        System.out.println("The sum is "+sum);
    }
    public static void add(int n1, int n2, int n3){
        int sum = n1 + n2 + n3;
        System.out.println("The sum is "+sum);
    }
}
