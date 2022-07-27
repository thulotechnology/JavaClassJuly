public class SwitchWork2 {
    public static void main(String[] args) {
        // Write a Java program to check whether a character is a vowel or consonant.

        String word = "Ball";
        String wordinlowercase = word.toLowerCase(); // ball
        char firstLetter = wordinlowercase.charAt(0); //b
        switch (firstLetter){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("This is vowel");
                break;
            case 'b':
            default:
                System.out.println("This is consonant.");
        }
    }
}
