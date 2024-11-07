package Q3;

public class Square extends Rectangle {

    // No-argument constructor
    public Square() {
        super(); // Call Rectangle's no-arg constructor
    }

    // Constructor with side length
    public Square(double side) {
        super(side, side); // Call Rectangle's constructor with width and length as side
    }

    // Constructor with color, filled, and side length
    public Square(String color, boolean filled, double side) {
        super(color, filled, side, side); // Call Rectangle's constructor
    }

    // Getter and setter for side length
    public double getSide() {
        return getWidth(); // Width and length are the same for a square
    }

    public void setSide(double side) {
        setWidth(side); // Set width and length to the same value
        setLength(side);
    }

    // Override toString method
    @Override
    public String toString() {
        return "A Square with side=" + getSide() + ", which is a subclass of " + super.toString();
    }
}