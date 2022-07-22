public class StringWork {
    public static void main(String[] args) {
        String country = "Usa";
        String country2 = null;

        String text = "Doctor says milk is good for health. milk gives us energy";

        System.out.println(country.toUpperCase());
        System.out.println(country.toLowerCase());
        System.out.println(country.length());
        System.out.println(country.charAt(2));
        System.out.println(country.equals(country2));
        System.out.println(text.substring(12,16));

       // WAP IN JAVA THAT TAKES your name as user input and display
        // enter full name
        // capital case
        // small case
        // length of name


        System.out.println(text.replace("milk","water"));
    }
}
