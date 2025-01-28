import java.util.Random;

public final class GenerateRandom {

    /**
     * The upper bound for generating random integers (exclusive).
     */
    private static final int RANDOM_INT_BOUND = 1000;

    /**
     * Private constructor to prevent instantiation.
     */
    private GenerateRandom() {
        throw new UnsupportedOperationException("Utility class");
    }

    /**
     * The main method that generates and prints random integers and doubles.
     *
     * @param args command-line arguments (not used).
     */
    public static void main(final String[] args) {
        // Create an instance of Random class
        Random rand = new Random();

        // Generate random integers in the range 0 to 999
        int randInt1 = rand.nextInt(RANDOM_INT_BOUND);
        int randInt2 = rand.nextInt(RANDOM_INT_BOUND);

        // Print random integers
        System.out.println("Random Integers: " + randInt1);
        System.out.println("Random Integers: " + randInt2);

        // Generate random doubles
        double randDub1 = rand.nextDouble();
        double randDub2 = rand.nextDouble();

        // Print random doubles
        System.out.println("Random Doubles: " + randDub1);
        System.out.println("Random Doubles: " + randDub2);
    }
}
