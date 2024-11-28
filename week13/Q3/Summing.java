import java.util.Scanner;

class SummingThread extends Thread {
    private int start;
    private int end;
    private int sum;

    public SummingThread(int start, int end) {
        this.start = start;
        this.end = end;
        this.sum = 0;
    }

    @Override
    public void run() {
        for (int i = start; i <= end; i++) {
            sum += i;
        }
    }

    public int getSum() {
        return sum;
    }
}

public class Summing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the value of num: ");
        int num = scanner.nextInt();
        
        System.out.print("Enter the number of threads (n): ");
        int n = scanner.nextInt();
        
        // Create an array of threads
        SummingThread[] threads = new SummingThread[n];
        int range = num / n; // Calculate the range for each thread
        int start = 1;

        // Create and start threads
        for (int i = 0; i < n; i++) {
            int end = (i == n - 1) ? num : start + range - 1; // Handle the last thread
            threads[i] = new SummingThread(start, end);
            threads[i].start();
            start = end + 1;
        }

        // Wait for all threads to finish and calculate the final sum
        int finalSum = 0;
        for (int i = 0; i < n; i++) {
            try {
                threads[i].join(); // Wait for thread to finish
                finalSum += threads[i].getSum(); // Get the sum from each thread
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Display the final sum
        System.out.println("The final sum is: " + finalSum);
        
        scanner.close();
    }
}