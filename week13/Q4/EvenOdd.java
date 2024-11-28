public class EvenOdd {

    public static void main(String[] args) {
        // Create threads for even and odd number printing
        Thread evenThread = new Thread(new EvenNumbers());
        Thread oddThread = new Thread(new OddNumbers());

        // Start the threads
        evenThread.start();
        oddThread.start();
    }
}
class EvenNumbers implements Runnable {
    @Override
    public void run() {
        synchronized (System.out) {
            System.out.print("Even Numbers: ");
            for (int i = 1; i <= 20; i++) {
                if (i % 2 == 0) {
                    System.out.print(i + ","); // Print even numbers on the same line
                }
            }
            System.out.println(); // Move to the next line after printing all even numbers
        }
    }
}

class OddNumbers implements Runnable {
    @Override
    public void run() {
        synchronized (System.out) {
            System.out.print("Odd Numbers: ");
            for (int i = 1; i <= 20; i++) {
                if (i % 2 != 0) {
                    System.out.print(i + ","); // Print odd numbers on the same line
                }
            }
            System.out.println(); // Move to the next line after printing all odd numbers
        }
    }
}