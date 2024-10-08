public class Week6Q2 {
    private static double annualInterestRate;
    private double savingsBalance;

    public Week6Q2(double initialBalance) {
        this.savingsBalance = initialBalance;
    }

    public void calculateMonthlyInterest() {
        double monthlyInterest = (savingsBalance * annualInterestRate) / 12;
        savingsBalance += monthlyInterest;
    }

    public static void modifyInterestRate(double newRate) {
        annualInterestRate = newRate / 100; // Convert percentage to decimal
    }

    public double getSavingsBalance() {
        return savingsBalance;
    }

    public static void main(String[] args) {
        // Create three SavingsAccount objects with different initial balances
        Week6Q2 account1 = new Week6Q2(2000.00);
        Week6Q2 account2 = new Week6Q2(3000.00);
        Week6Q2 account3 = new Week6Q2(4000.00);

        // Set the annual interest rate to 4%
        Week6Q2.modifyInterestRate(4);

        // Calculate and print the monthly interest for each account
        account1.calculateMonthlyInterest();
        account2.calculateMonthlyInterest();
        account3.calculateMonthlyInterest();

        System.out.println("Balances after applying 4% interest:");
        System.out.println("Account 1: $" + account1.getSavingsBalance());
        System.out.println("Account 2: $" + account2.getSavingsBalance());
        System.out.println("Account 3: $" + account3.getSavingsBalance());

        // Set the annual interest rate to 5%
        Week6Q2.modifyInterestRate(5);

        // Calculate and print the next month's interest for each account
        account1.calculateMonthlyInterest();
        account2.calculateMonthlyInterest();
        account3.calculateMonthlyInterest();

        System.out.println("Balances after applying 5% interest:");
        System.out.println("Account 1: $" + account1.getSavingsBalance());
        System.out.println("Account 2: $" + account2.getSavingsBalance());
        System.out.println("Account 3: $" + account3.getSavingsBalance());
    }
}
