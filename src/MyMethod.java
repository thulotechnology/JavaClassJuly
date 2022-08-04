public class MyMethod {

    public static void main(String[] args) {
        dateConvert();
        // Here 1995 is argument
        findAge(1995);
        findAge(1990);
    }

    public static void dateConvert(){
        System.out.println("This method is responsible for date convert.");
    }
    // Here birth year is parameter
    public static void findAge(int birthYear){
        int age = 2022 - birthYear;
        System.out.println("Your age is "+age);
        dateConvert();
    }

}
