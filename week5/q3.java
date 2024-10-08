
import java.util.Scanner;
class Purse {
private int dirham;
private int fiftyFills;
private int twentyFiveFills;
public Purse() {
this.dirham = 0;
this.fiftyFills = 0;
this.twentyFiveFills = 0;
}
public void addDirham(int amount) {
if (amount >= 0) {
this.dirham += amount;
} else {
System.out.println("Amount cannot be negative.");
}
}
public void removeDirham(int amount) {
if (amount <= this.dirham && amount >= 0) {
this.dirham -= amount;
} else {
System.out.println("Invalid amount to remove.");
}
}
public void add50fills(int amount) {
if (amount >= 0) {
this.fiftyFills += amount;
} else {
System.out.println("Amount cannot be negative.");
}
}
public void remove50fills(int amount) {
if (amount <= this.fiftyFills && amount >= 0) {
this.fiftyFills -= amount;
} else {
System.out.println("Invalid amount to remove.");
}
}
public void add25fills(int amount) {
if (amount >= 0) {
this.twentyFiveFills += amount;
} else {
System.out.println("Amount cannot be negative.");
}
}
public void remove25fills(int amount) {
if (amount <= this.twentyFiveFills && amount >= 0) {
this.twentyFiveFills -= amount;
} else {
System.out.println("Invalid amount to remove.");
}
}
public void totalCash() {
float total = dirham + (fiftyFills * 0.5f) + (twentyFiveFills * 0.25f);
System.out.println("Total cash: " + total + " dirhams");
}
}
public class q3 {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
Purse purse = new Purse();
System.out.print("Enter dirhams to add: ");
purse.addDirham(scanner.nextInt());
System.out.print("Enter 50 fills to add: ");
purse.add50fills(scanner.nextInt());
System.out.print("Enter 25 fills to add: ");
purse.add25fills(scanner.nextInt());
purse.totalCash();
System.out.print("Enter dirhams to remove: ");
purse.removeDirham(scanner.nextInt());
System.out.print("Enter 50 fills to remove: ");
purse.remove50fills(scanner.nextInt());
System.out.print("Enter 25 fills to remove: ");
purse.remove25fills(scanner.nextInt());
purse.totalCash();
scanner.close();
}
}





