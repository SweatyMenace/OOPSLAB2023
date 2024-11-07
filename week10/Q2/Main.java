package Q2;

public class Main {
    public static void main(String[] args) {
        Car classicCar = new ClassicCar(15000, 1985);
        System.out.println("Classic Car Sale Price: $" + classicCar.calculateSalePrice());

        Car sportCar1 = new SportCar(20000, 2005);
        System.out.println("Sport Car (2005) Sale Price: $" + sportCar1.calculateSalePrice());

        Car sportCar2 = new SportCar(20000, 1998);
        System.out.println("Sport Car (1998) Sale Price: $" + sportCar2.calculateSalePrice());

        Car sportCar3 = new SportCar(20000, 1990);
        System.out.println("Sport Car (1990) Sale Price: $" + sportCar3.calculateSalePrice());
    }
}