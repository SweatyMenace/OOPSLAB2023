import java.util.Scanner;

class Car {
    
    private String vehicleID;
    private float[] cost = new float[3];
    private float total;
    private float grandTotal;

    public Car(String vehicleID, float base, float exciseDuty, float salesTax) {
        this.vehicleID = vehicleID;
        this.cost[0] = base;
        this.cost[1] = exciseDuty;
        this.cost[2] = salesTax;
    }
    public void calcTotal(){
        total = cost[0] + cost[1] + cost[2];
    }
    public void calcGrandTotal() {
        grandTotal = total - (total*0.10f);
    }
    public float getGrandTotal() {
        return grandTotal;
    }
    public void printDetails() {
        System.out.println("VehicleID: "+vehicleID);
        System.out.println("Base: " + cost[0]);
        System.out.println("Excise Duty: " + cost[1]);
        System.out.println("Sales Tax: " + cost[2]);
        System.out.println("Total: " + total);
        System.out.println("Grand Total: " + grandTotal);
        System.out.println();
    }
}
public class Showroom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of cars:");
        int n = scanner.nextInt();
        Car[] cars = new Car[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter the details of car " + (i + 1) +":");
            System.out.println("Enter the vehicle ID:");
            String vehicleID = scanner.next();
            System.out.println("Enter the base price:");
            float base = scanner.nextFloat();
            System.out.println("Enter the excise duty:");
            float exciseDuty = scanner.nextFloat();
            System.out.println("Enter the sales tax:");
            float salesTax = scanner.nextFloat();

            cars[i] = new Car(vehicleID, base, exciseDuty, salesTax);
            cars[i].calcTotal();
            cars[i].calcGrandTotal();
        }

        float maxGrandTotal = cars[0].getGrandTotal();
        int maxIndex = 0;

        for (int i = 1; i < cars.length; i++){
            if (cars[i].getGrandTotal()>maxGrandTotal){
                maxGrandTotal = cars[i].getGrandTotal();
                maxIndex = i;
            }
        }

        System.out.println("The car with the maximum grand total is:");
        cars[maxIndex].printDetails();
    }
}