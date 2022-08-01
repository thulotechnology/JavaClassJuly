public class MethodType {
    // This is main method
    public static void main(String[] args) {


        int personAge = 14;

        if(personAge >= voterAge()){
            System.out.println("The person is voter.");
        }else{
            System.out.println("The person is not voter.");
        }

        int personAge2 = 45;
        if(personAge2 >= voterAge()){
            System.out.println("The person is voter.");
        }else{
            System.out.println("The person is not voter.");
        }



//    int myValue =   add1(10,30);
//    myValue +=40;
//        System.out.println("Here myvalue is "+ myValue);
//
//        String myfullName = fullName("John","Doe");
//        System.out.println(myfullName);

    }
    //No Parameter No Return Type
    public static void displayName(){
        System.out.println("Bishworaj Poudel.");
    }
    //Parameter and No Return Type
    public static void add(int n1, int n2){
        int total = n1 + n2;
        System.out.println("The sum is "+total);
    }
    // Parameter and Return Type
    public static int add1(int n1, int n2){
        int total = n1 + n2;
        return total;
    }
    // Parameter and Return Type
    public static String fullName(String fname, String lname){
        String fullName = fname +" " + lname;
        return fullName;
    }
    //No Parameter and Return Type
    public static int voterAge(){
        return 18;
    }
}
// WAP IN JAVA THAT FINDS MULTIPLICATION OF NUMBER USING Parameter and No Return Type Method.
// 4 Minutes