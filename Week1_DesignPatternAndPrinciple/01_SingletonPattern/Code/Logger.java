public class Logger {
    // Private static instance
    private static Logger instance;

    // Private constructor prevents instantiation from outside
    private Logger() {
        // You can initialize resources if needed
    }

    // Public method to get the single instance
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    // Method for demonstration
    public void log(String message) {
        System.out.println("[LOG] " + message);
    }
}
