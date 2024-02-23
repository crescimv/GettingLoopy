public class countingForLoops {
    public static void main(String[] args) {

        //starts at 0, increases by 1 as long as i <= 30
        for (int i = 0; i <= 30; i++)
            System.out.println(i);

        System.out.println();

        //starts at 30, decreases by 1 as long as i >= 0
        for (int i = 30; i >= 0; i--)
            System.out.println(i);

        System.out.println();

        //starts at 0, increases by 3 as long as i <= 18
        for (int i = 0; i <= 18; i += 3)
            System.out.println(i);

        System.out.println();

        //starts at 10, decreases by 2 as long as i >= 10
        for (int i = 10; i >= 0; i -= 2)
            System.out.println(i);
    }
}