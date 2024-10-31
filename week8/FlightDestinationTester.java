import java.util.ArrayList;
import java.util.Scanner;

class FlightDest {
    private String flightNo;
    private String destination;

    // Constructor
    public FlightDest(String flightNo, String destination) {
        this.flightNo = flightNo;
        this.destination = destination;
    }

    // Getter for flight number
    public String getFlightNo() {
        return flightNo;
    }

    // Getter for destination
    public String getDestination() {
        return destination;
    }
}

class FlightInfo {
    private ArrayList<FlightDest> flightDestList;

    // Constructor to initialize the FlightInfo class
    public FlightInfo() {
        flightDestList = new ArrayList<>();
    }

    // Method to add a flight-destination pair
    public void addFlightDestPair(String fNo, String dest) {
        FlightDest flightDest = new FlightDest(fNo, dest);
        flightDestList.add(flightDest);
    }

    // Method to get flight numbers for a given destination
    public ArrayList<String> getFlightsDest(String dest) {
        ArrayList<String> flightNos = new ArrayList<>();
        for (FlightDest flightDest : flightDestList) {
            if (flightDest.getDestination().equalsIgnoreCase(dest)) {
                flightNos.add(flightDest.getFlightNo());
            }
        }
        return flightNos;
    }
}

public class FlightDestinationTester {
    public static void main(String[] args) {
        FlightInfo flightInfo = new FlightInfo();
        Scanner scanner = new Scanner(System.in);

        // Loop to add flight-destination pairs
        while (true) {
            System.out.print("Enter flight number (or type 'exit' to finish): ");
            String flightNo = scanner.nextLine();
            if (flightNo.equalsIgnoreCase("exit")) {
                break;
            }
            System.out.print("Enter destination: ");
            String destination = scanner.nextLine();
            flightInfo.addFlightDestPair(flightNo, destination);
        }

        // Retrieving flights for a specific destination
        System.out.print("Enter a destination to retrieve flights: ");
        String destination = scanner.nextLine();
        ArrayList<String> flightsToDest = flightInfo.getFlightsDest(destination);

        // Displaying the results
        System.out.println("Flights to " + destination + ": " + flightsToDest);
    }
} 
