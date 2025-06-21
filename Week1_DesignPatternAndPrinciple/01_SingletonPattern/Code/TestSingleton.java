public class TestSingleton {
    public static void main(String[] args) {
        // Get instances
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        // Compare instances
        System.out.println("Are logger1 and logger2 the same? " + (logger1 == logger2));

        // Log messages
        logger1.log("This is a test message.");
        logger2.log("This is another test message.");
    }
}
