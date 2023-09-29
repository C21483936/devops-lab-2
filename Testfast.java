import java.util.Scanner;

public class AverageCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of values to average: ");
        int numValues = scanner.nextInt();

        if (numValues <= 0) {
            System.out.println("Please enter a valid number of values.");
            scanner.close();
            return;
        }

        double sum = 0;

        for (int i = 1; i <= numValues; i++) {
            System.out.print("Enter value " + i + ": ");
            double value = scanner.nextDouble();
            sum += value;
        }

        double average = sum / numValues;
        System.out.println("The average of the " + numValues + " values is: " + average);

        scanner.close();
    }
}
