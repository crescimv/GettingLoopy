public class nestedLoop2 {
    public static void main(String[] args) {

        String symbol = "*";

        /* First loop begins at 5, and continues to decrease by 1 until reaching 1.
        * Second loop decreases columns by 1 as long as columns is less than or equal to 1. */
        for (int rows=5; rows>=1; rows--) {
            System.out.println();
            for (int columns=1; columns<=rows; columns++) {
                System.out.print(symbol);
            }
        }
    }
}