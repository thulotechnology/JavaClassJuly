package Method;
// Create 3 Method With Same Name to Multiply Numbers [2,3,4] 3 Min.
public class AddMethod {
    public static void main(String[] args) {
    add(10,10);
    add(10, 2.1);
    add(2,2,2);
    add(1,1,1,1);
    }
    public static void add(int n1, int n2){
        int sum = n1 + n2;
        System.out.println("The sum is "+sum);
    }
    public static void add(int n1, double n2){
        double sum = n1 + n2;
        System.out.println("The sum is "+sum);
    }
    public static void add(int n1, int n2, int n3){
        int sum = n1 + n2+ n3;
        System.out.println("The sum is "+sum);
    }
    public static void add(int n1, int n2, int n3, int n4){
        int sum = n1 + n2+ n3 + n4;
        System.out.println("The sum is "+sum);
    }
}
