package Q2;

public class ClassicCar extends Car {
    public ClassicCar(double price, int year) {
        super(price, year);
    }

    @Override
    public double calculateSalePrice() {
        return 10000; // Fixed sale price for classic cars
    }
}