import java.util.Scanner;

public class cp3q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int targetNumber = (int) (Math.random() * 10);

        System.out.println("Welcome to the guessing game!");
        System.out.println("The target number is between 0 and 9.");

        Player player1 = new Player("Player 1");
        Player player2 = new Player("Player 2");
        Player player3 = new Player("Player 3");

        System.out.print("Enter " + player1.getName() + "'s guess: ");
        int guess1 = scanner.nextInt();

        System.out.print("Enter " + player2.getName() + "'s guess: ");
        int guess2 = scanner.nextInt();

        System.out.print("Enter " + player3.getName() + "'s guess: ");
        int guess3 = scanner.nextInt();

        boolean player1Won = guess1 == targetNumber;
        boolean player2Won = guess2 == targetNumber;
        boolean player3Won = guess3 == targetNumber;

        System.out.println("Target number was: " + targetNumber);
        System.out.println("Results:");
        if (player1Won) {
            System.out.println(player1.getName() + " guessed correctly!");
        }
        if (player2Won) {
            System.out.println(player2.getName() + " guessed correctly!");
        }
        if (player3Won) {
            System.out.println(player3.getName() + " guessed correctly!");
        }
        if (!(player1Won || player2Won || player3Won)) {
            System.out.println("No players guessed correctly.");
        }
    }
}

class Player {
    private String name;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
