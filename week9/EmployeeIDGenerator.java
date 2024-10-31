import java.util.Random;
import java.util.Scanner;

public class EmployeeIDGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Enter Year of Joining: ");
        String year = scanner.nextLine();

        System.out.print("Enter Discipline (CHEM-A1, EEE-A3, MECH-A4, CS-A7): ");
        String discipline = scanner.nextLine();

        System.out.print("Enter Staff (S) or Faculty (F): ");
        String staff = scanner.nextLine().toUpperCase();

        System.out.print("Enter Campus (Pilani P, Hyderabad H, Goa G, Dubai U): ");
        String campus = scanner.nextLine().toUpperCase();

        int randomNumber = 100 + random.nextInt(900); // Generates a number between 100 and 999

        String employeeID = year + discipline.charAt(3) + staff + String.format("%03d", randomNumber) + campus;

        String emailDomain = "bits-pilani.ac.in";
        String emailID = year + String.format("%03d", randomNumber) + "@" + campus.toLowerCase() + "." + emailDomain;

        System.out.println("Employee ID: " + employeeID);
        System.out.println("Email ID: " + emailID);
    }
}