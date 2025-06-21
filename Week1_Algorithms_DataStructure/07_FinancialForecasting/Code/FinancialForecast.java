import java.util.Scanner;

public class FinancialForecast {

    // ==================================================
    // RECURSIVE METHOD
    // ==================================================
    public static double forecastFutureValueRecursive(double presentValue, double growthRate, int years) {
        if (years <= 0) {
            return presentValue;
        }
        return forecastFutureValueRecursive(presentValue * (1 + growthRate), growthRate, years - 1);
    }

    // ==================================================
    // ITERATIVE METHOD
    // ==================================================
    public static double forecastFutureValueIterative(double presentValue, double growthRate, int years) {
        double futureValue = presentValue;
        for (int i = 0; i < years; i++) {
            futureValue = futureValue * (1 + growthRate);
        }
        return futureValue;
    }

    // ==================================================
    // MAIN METHOD
    // ==================================================
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n=== Financial Forecasting Tool ===");
        System.out.print("Enter Present Value: ");
        double presentValue = scanner.nextDouble();

        System.out.print("Enter Annual Growth Rate (e.g., 0.07 for 7%): ");
        double growthRate = scanner.nextDouble();

        System.out.print("Enter Number of Years: ");
        int years = scanner.nextInt();

        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Forecast using Recursion");
            System.out.println("2. Forecast using Iteration");
            System.out.println("3. Forecast using Direct Math");
            System.out.println("4. Exit");
            System.out.print("Enter choice (1-4): ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    double futureValueRec = forecastFutureValueRecursive(presentValue, growthRate, years);
                    System.out.println("\nFuture Value (Recursion) after " + years + " years: " + futureValueRec);
                    break;

                case 2:
                    double futureValueIter = forecastFutureValueIterative(presentValue, growthRate, years);
                    System.out.println("\nFuture Value (Iteration) after " + years + " years: " + futureValueIter);
                    break;

                case 3:
                    double futureValueDirect = presentValue * Math.pow(1 + growthRate, years);
                    System.out.println("\nFuture Value (Direct Math) after " + years + " years: " + futureValueDirect);
                    break;

                case 4:
                    System.out.println("\nExiting... Thank you!");
                    scanner.close();
                    return;

                default:
                    System.out.println("\nInvalid choice! Please try again.");
            }
        }
    }
}
