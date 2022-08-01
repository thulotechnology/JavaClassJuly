package Method;

public class BooleanWork {
    public static void main(String[] args) {
        findEven(50, 60);
        System.out.println("------------------------------");
        findOdd(50,60);
        System.out.println(".........................");
        findEvenOdd(50,60);

    }

    // Method that find person is voter or not
    public static boolean isVoter(int age){
        if(age>=18){
            return true;
        }else{
            return false;
        }
    }

    public static void findEven(int start, int end){
        for(int i=start; i<=end; i++){
            if(i%2 == 0){
                System.out.println(i+ " is even.");
            }
        }
    }
    public static void findEvenOdd(int start, int end){
        for(int i=start; i<=end; i++){
            if(i%2 == 0){
                System.out.println(i+ " is even.");
            }else{
                System.out.println(i+ " is odd.");
            }
        }
    }
    public static void findOdd(int start, int end){
        for(int i=start; i<=end; i++){
            if(i%2 != 0){
                System.out.println(i+ " is odd.");
            }
        }
    }

}
