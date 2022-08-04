public class ArrayWork3 {
    public static void main(String[] args) {
        double [] weeklyExpeses = {120, 340, 500, 32, 290, 34, 34};
        double sum = 0;

        for(int i=0; i<weeklyExpeses.length; i++ ){
            sum+=weeklyExpeses[i];
        }
        System.out.println("Total is "+sum);
        double avg = sum / weeklyExpeses.length;
        System.out.println("Avg expenses: "+avg);
    }
}
// WAP IN JAVA TO FIND AVG AND SUM OF TOTAL EXPENSES OF EACH MONTH USING ARRAYS
// AND LOOP.