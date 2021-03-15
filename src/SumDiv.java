/* Michael Saar */
/* 315240937 */

/**
 * @author Michael Saar
 * @since 2021-03-09 */

public class SumDiv {

    private static final int ARGS_LEN = 3; //valid number of arguments

    /**
     * gets three integers a,b,c as arguments and prints all the numbers between 1 and a, which are
     *         divisible by b or by c. It also prints the sum of all of those numbers.
     *
     * @param args : three integers greater than 0
     */
    public static void main(String[] args) {
        /* if there are less than 3 arguments the input is invalid */
        if (args.length != ARGS_LEN) {
            System.out.println("Invalid input");
            return;
        }
        int[] arguments = new int[ARGS_LEN];
        /* converting strings to integers and checking if all arguments are greater than 0 */
        for (int i = 0; i < ARGS_LEN; i++) {
            arguments[i] = Integer.parseInt(args[i]);
            if (arguments[i] <= 0) {
                System.out.println("Invalid input");
                return;
            }
        }
        int sum = 0;
        /* run through range of 1 to a, print and sum all numbers that are divisible by b or c and the sum of them */
        for (int i = 1; i <= arguments[0]; i++) {
            if ((i % arguments[1] == 0) || (i % arguments[2] == 0)) { // arguments[1] is b and arguments[2] is c
                sum += i;
                System.out.println(i);
            }
        }
        System.out.println(sum);
    }
}
