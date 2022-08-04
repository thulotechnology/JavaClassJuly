package Method;

public class BooleanReturn {
    public static void main(String[] args) {
    boolean ramResult = isPassed(30);
    if(ramResult == true){
        System.out.println("You are passed");
    }else{
        System.out.println("You are failed.");
    }
    }

    public static boolean isPassed(int mark){
        if(mark>=40){
            return true;
        }else{
            return false;
        }
    }
}
