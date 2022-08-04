public class MathWork2 {
    public static void main(String[] args) {
//        System.out.println(Math.max(20,40));
//        System.out.println(Math.min(20,40));
//        System.out.println(Math.round(25.1));
//        System.out.println(Math.floor(25.9));
//        System.out.println(Math.ceil(25.9));
//        System.out.println(Math.pow(2,3));
//        System.out.println(Math.sqrt(25));
        int min = 20;
        int max  = 30;

        double random = Math.random() * (max - min + 1) + min;
            int value = (int)Math.floor(random);
        System.out.println(value);
    }
}
