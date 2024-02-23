public class nestedLoop3 {
    public static void main(String[] args) {

        String symbol = "*";
        /* First loop starts at 1 and loops until reaching a value of 5.
        * Second loop does the same function but with columns.  */
        for (int rows=1; rows<=5; rows++) {
            System.out.println();
            for (int columns=1; columns<=5; columns++) {
                System.out.print(symbol);
            }
        }
    }
}