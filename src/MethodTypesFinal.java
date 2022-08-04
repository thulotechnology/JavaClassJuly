public class MethodTypesFinal {
    public static void main(String[] args) {
    displayBookName();
        findSquare(5);
        findSquare(6);
        int total = findSum(10,20);
        total+=5;
        System.out.println("Total is "+total);

        int ramAge = 18;
        if(ramAge>= voterAge()){
            System.out.println("Voter");
        }else{
            System.out.println("Not voter.");
        }
    }
    // No Parm and no return type
    public static void displayBookName(){
        System.out.println("Book name is China Harayeko Manxe");
    }
    // Parm and no return type
    public static void findSquare(int num){
        int sq = num * num;
        System.out.println("Square is "+sq);
    }

    // Parm and  return type

    public static int findSum(int n1, int n2){
        int sum = n1 + n2;
       return sum;
    }
    // No Parm and  return type
    public static int voterAge(){
        return 18;
    }
}
