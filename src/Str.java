public class Str {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Invalid input");
            return;
        }
        String query = args[0];
        String[] sequence = args[1].split("_", -1);
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
