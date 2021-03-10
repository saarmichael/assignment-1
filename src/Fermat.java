//315240937

/**
 * @author Michael Saar
 * @since 2021-03-10 */

public class Fermat {

    /**
     * @param n the root degree (1/n)
     * @param num the number to operate the Nth root on
     * @return if
     */
    public static boolean isCorrectRoot(int n, int num) {
        double root = Math.pow(num, 1.0 / n);
        return Math.pow(Math.round(root), n) == num;
    }

    public static void main(String[] args) {
        if (args.length != 2) {
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
                double c = Math.pow((Math.pow(i, n) + Math.pow(j, n)), 1.0 / n);
            }
        }
    }
}
