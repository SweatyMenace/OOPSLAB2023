import java.util.Scanner;

public class PhoneNumberIdentifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter a phone number
        System.out.print("Enter a phone number : ");
        String phoneNumber = scanner.nextLine();
        
        // Check if the phone number starts with the UAE country code
        if (phoneNumber.startsWith("00971")) {
            // Extract the next digit to identify the emirate
            char emirateCode = phoneNumber.charAt(5);
            String emirate = "";

            // Determine the emirate based on the code
            switch (emirateCode) {
                case '2':
                    emirate = "Abu Dhabi";
                    break;
                case '3':
                    emirate = "Al Ain";
                    break;
                case '4':
                    emirate = "Dubai";
                    break;
                case '6':
                    emirate = "Sharjah";
                    break;
                default:
                    emirate = "Unknown emirate";
            }

            // Display the results
            System.out.println("00971 (UAE Code) + " + emirateCode + " - " + emirate);
        } else {
            System.out.println("The phone number is not a valid UAE number.");
        }

        scanner.close();
    }
}