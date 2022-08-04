public class Stringrev {
    public static void main(String[] args) {
        int number = 10005;
       rev(number+"");
    }

    public static void rev(String name){
        String result = "";
        for(int i=name.length()-1; i>=0; i--){
            result += name.charAt(i);
        }
        System.out.println("Reverse is "+result);
    }

//Write a program in Java to store 10 student names and print all using array. [3 Min]

}
