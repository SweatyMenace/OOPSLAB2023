package Q2;

public class SportCar extends Car {
    public SportCar(double price, int year) {
        super(price, year);
    }

    @Override
    public double calculateSalePrice() {
        if (year > 2000) {
            return 0.75 * super.calculateSalePrice();
        } else if (year > 1995) {
            return 0.5 * super.calculateSalePrice();
        } else {
            return 0.25 * super.calculateSalePrice();
        }
    }
}