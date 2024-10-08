import java.util.Scanner;

class CreditCard {
    private String name;
    private long cardNo = (long) (Math.random() * 1e16);
    private boolean enabled = true;
    private int pin, cardType, currentCredit;
    private final int[] creditLimits = {10000, 25000, 50000};

    public CreditCard(Scanner scanner) {
        System.out.print("Enter name for card holder: ");
        this.name = scanner.nextLine();
        this.pin = setPin(scanner);
        System.out.print("Choose card type (1-Silver, 2-Gold, 3-Platinum): ");
        cardType = scanner.nextInt() - 1;
        while (cardType < 0 || cardType > 2) {
            System.out.print("Invalid option! Choose (1-3): ");
            cardType = scanner.nextInt() - 1;
        }
        currentCredit = 0; // Initialize current credit
    }

    private int setPin(Scanner scanner) {
        int pin;
        do {
            System.out.print("Set a 4-digit pin: ");
            pin = scanner.nextInt();
        } while (pin < 1000 || pin > 9999);
        return pin;
    }

    public void addCredit(int amount) {
        currentCredit += amount;
        System.out.println("Credit added! Current credit: " + currentCredit);
    }

    public void transact(Scanner scanner) {
        System.out.print("Enter pin: ");
        if (scanner.nextInt() == pin) {
            System.out.print("Amount to transfer: ");
            int amount = scanner.nextInt();
            if (enabled && amount <= currentCredit && amount <= creditLimits[cardType]) {
                currentCredit -= amount;
                System.out.println("Transaction successful! Remaining credit: " + currentCredit);
            } else {
                System.out.println("Insufficient funds or card disabled.");
            }
        } else {
            System.out.println("Wrong pin!");
        }
    }

    public void toggleStatus() {
        enabled = !enabled;
        System.out.println("Card is now " + (enabled ? "enabled." : "disabled."));
    }

    public void display() {
        System.out.printf("Card Holder: %s, Card No: %d, Current Credit: %d, Status: %s%n",
                          name, cardNo, currentCredit, enabled ? "Enabled" : "Disabled");
    }
}

public class CreditCardTester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CreditCard myCard = new CreditCard(scanner);
        int choice;
        do {
            System.out.print("1-Display, 2-Add Credit, 3-Transfer, 4-Toggle Status, 5-Exit: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    myCard.display();
                    break;
                case 2:
                    System.out.print("Enter amount to add: ");
                    myCard.addCredit(scanner.nextInt());
                    break;
                case 3:
                    myCard.transact(scanner);
                    break;
                case 4:
                    myCard.toggleStatus();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        } while (choice != 5);
        scanner.close();
    }
}