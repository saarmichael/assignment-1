//315240937

/**
 * @author Michael Saar
 * @since 2021-03-10 */

public class Fermat {
    private static final int ARGS_LEN = 2;
    public static void main(String[] args) {
        if (args.length != ARGS_LEN) {
            System.out.println("Invalid input");
            return;
        }
        int n = Integer.parseInt(args[0]);
        int range = Integer.parseInt(args[1]);
        if (n <= 0 || range <= 0) {
            System.out.println("Invalid input");
            return;
        }
        boolean isSolutionExists = false;
        for (int i = 1; i <= range - 2; i++) {
            for (int j = i; j <= range - 1; j++) {
                for (int k = j; k <= range; k++) {
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
