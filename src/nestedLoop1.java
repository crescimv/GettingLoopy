public class nestedLoop1 {
    public static void main(String[] args) {

        String symbol = "*";

        /* all nested loop programs besides extra credit use "rows" and "columns" instead of index.
        This is because when I was learning how they worked, this was the easiest to understand for me. */

        /* Prints 1 row, then moves to next for loop and increases columns by 1, then repeats.
        * Rows stop when reaching <=5 to allow for 5 columns. */
        for (int rows=1; rows<=5; rows++) {
            System.out.println();
            for (int columns=1; columns<=rows; columns++) {
                System.out.print(symbol);
            }
        }
        }
    }
