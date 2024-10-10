import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        printTable(n);
    }

    public static void printTable(int n) {
        System.out.println("Multiplication Table");
        System.out.println("---------------------------------------------");
        System.out.print("    |");
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%4d", i);
        }
        System.out.println();
        System.out.println("---------------------------------------------");
        for (int i = 1; i <= n; i++) {
            System.out.printf("%3d |", i);
            for (int j = 1; j <= 10; j++) {
                System.out.printf("%4d", i * j);
            }
            System.out.println();
        }
    }
}