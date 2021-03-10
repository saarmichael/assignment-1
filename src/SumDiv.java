//315240937

/**
 * @author Michael Saar
 * @since 2021-03-09 */

public class SumDiv {
    //valid number of arguments
    private static final int ARGS_LEN = 3;

    /**
     * @param args: three integers
     */
    public static void main(String[] args) {
        //if there are less than 3 arguments
        if (args.length != ARGS_LEN) {
            System.out.println("Invalid input");
            return;
        }
        int[] arguments = new int[3];
        //converting strings to integers and checking if all arguments are greater than 0
        for (int i = 0; i < ARGS_LEN; i++) {
            arguments[i] = Integer.parseInt(args[i]);
            if (arguments[i] <= 0) {
                System.out.println("Invalid input");
                return;
            }
        }
        int sum = 0;
        //run through range of 1 to a, print and sum all numbers that are divisible by b or c, print a and the sum
        for (int i = 1; i < arguments[0]; i++) {
            if ((i % arguments[1] == 0) || (i % arguments[2] == 0)) {
                sum += i;
                System.out.println(i);
            }
        }
        System.out.println(arguments[0]);
        System.out.println(sum);
    }
}
