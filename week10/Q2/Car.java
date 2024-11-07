package Q2;

public class Car {
    private double price;
    protected int year;

    public Car(double price, int year) {
        this.price = price;
        this.year = year;
    }

    public double calculateSalePrice() {
        return price; 
    }
}