package arrays;

/** Assumes command line arguments are integers, and computes their average.
 */
public class Average {
    public static void main(String[] args) {
        double sum = 0;
        if (args.length == 0)
            return;
        for (int i = 0; i < args.length; i++)
            sum += Integer.parseInt(args[i]);
        System.out.println(sum / args.length);
    }

}
