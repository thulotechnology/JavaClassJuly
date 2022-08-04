public class RandomWork {
    public static void main(String[] args) {
        int min = 500;
        int max = 800;

        double random = Math.random() * (max - min + 1) + min;
        int myValue = (int)Math.floor(random);

        System.out.println(myValue);

    }
}
// WAP IN JAVA TO GENERATE RANDOM NUMBER BETWEEN 500 TO 800
