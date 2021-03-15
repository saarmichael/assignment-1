// Michael Saar
// 315240937

/**
 * @author Michael Saar
 * @since 2021-03-10 */

public class Fermat {
    //valid number of arguments
    private static final int ARGS_LEN = 2;

    /**
     * @param args two integers n, range. Valid value: positive integers. The input is assumed to be integers.
     */

    public static void main(String[] args) {
        /*
        this main method gets two integers n and range and prints all the Pythagorean equations s.t (1 < a,b,c < n), and
        a^n + b^n = c^n
         */

        //check validity of number of arguments
        if (args.length != ARGS_LEN) {
            System.out.println("Invalid input");
            return;
        }
        //get n and range from args
        int n = Integer.parseInt(args[0]);
        int range = Integer.parseInt(args[1]);
        //if n or range are not positive, the input is invalid
        if (n <= 0 || range <= 0) {
            System.out.println("Invalid input");
            return;
        }
        //run through 1 to range
        boolean isSolutionExists = false;
        for (int i = 1; i <= range - 1; i++) {
            for (int j = i; j <= range - 1; j++) {
                for (int k = j; k <= range - 1; k++) {
                    if (Math.pow(i, n) + Math.pow(j, n) == Math.pow(k, n)) {
                        isSolutionExists = true;
                        System.out.println(i + "," + j + "," + k);
                    }
                }
            }
        }
        if (!isSolutionExists) {
            System.out.println("no");
        }
    }
}
