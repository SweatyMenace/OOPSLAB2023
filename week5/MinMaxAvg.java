import java.util.Scanner;

public class MinMaxAvg {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter no. of floating numbers: ");
        int n = scanner.nextInt();
        double[] numbers = new double[n];
        System.out.print("Enter " + n + " floating numbers (separated by space): ");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextDouble();
        }

        double max = numbers[0];
        double min = numbers[0];
        double sum = 0;
        for (double num : numbers) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
            sum += num;
        }

        double avg = sum / n;

        System.out.println("Max is " + max);
        System.out.println("Min is " + min);
        System.out.println("Avg is " + avg);
    }
}