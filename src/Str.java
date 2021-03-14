//315240937

/**
 * @author Michael Saar
 * @since 2021-03-13 */

public class Str {

    private static final int ARGS_LEN = 2;
    private static final String SEQUENCE_SPLITTER = "_";
    public static void main(String[] args) {
        if (args.length != ARGS_LEN) {
            System.out.println("Invalid input");
            return;
        }
        String query = args[0];
        String[] sequence = args[1].split(SEQUENCE_SPLITTER, -1);
        for (int i = 0; i < sequence.length; i++) {
            if (sequence[i].startsWith(query)) {
                System.out.println(sequence[i]);
            }
        }
        for (int i = 0; i < sequence.length; i++) {
            if (sequence[i].contains(query)) {
                System.out.println(sequence[i]);
            }
        }
    }
}
