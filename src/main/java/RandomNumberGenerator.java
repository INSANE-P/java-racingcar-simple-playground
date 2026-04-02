public class RandomNumberGenerator {
    private static final int MIN_NUMBER = 0;
    private static final int MAX_NUMBER = 9;

    public int generate() {
        return (int) (Math.random() * (MAX_NUMBER + 1) + MIN_NUMBER);
    }
}
