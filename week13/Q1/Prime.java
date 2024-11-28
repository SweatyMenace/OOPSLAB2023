// Custom exception class

import java.util.Scanner;

class NegativeInputException extends Exception {
    public NegativeInputException(String message) {
        super(message);
    }
}

// Prime class to generate prime numbers
public class Prime {
    private int range;

    // Constructor that throws NegativeInputException for negative input
    public Prime(int range) throws NegativeInputException {
        if (range < 0) {
            throw new NegativeInputException("Range cannot be negative.");
        }
        this.range = range;
    }

    // Method to generate prime numbers between 1 and the given range
    public void generatePrimes() {
        System.out.println("Prime numbers between 1 and " + range + ":");
        for (int num = 2; num <= range; num++) {
            if (isPrime(num)) {
                System.out.print(num + " ");
            }
        }
        System.out.println(); // for a new line after printing all primes
    }

    // Helper method to check if a number is prime
    private boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    // Main method to test the Prime class
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the range to generate prime numbers: ");
        
        try {
            int userRange = scanner.nextInt(); // Taking user input for the range
            Prime primeGenerator = new Prime(userRange); // Create Prime object
            primeGenerator.generatePrimes(); // Generate and print prime numbers
        } catch (NegativeInputException e) {
            System.err.println(e.getMessage()); // Print error message if negative input
        } catch (Exception e) {
            System.err.println("Invalid input. Please enter a valid integer."); // Handle invalid input
        } finally {
            scanner.close(); // Close the scanner to avoid resource leak
        }
    }
}