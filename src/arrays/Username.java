package arrays;

/** Class Username. Shows how to use command line arguments to the
 *  program.
 */
public class Username {

    /**
     * Uses two command line arguments to generate a user name
     * @param args
     */
    public static void main(String[] args) {
        if (args.length < 2)
            return;
        if (args[0].length() < 3 || args[1].length() < 3)
            return;
        String username = args[0].substring(0, 3) + "_" +
                args[1].substring(0, 3);
        System.out.println("First name: "+ args[0]);
        System.out.println("Last name: " + args[1]);
        System.out.println("Username: " + username);

    }
}
