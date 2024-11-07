package Q3;

public class Rectangle extends Shape {
    private double width;
    private double length;

    // No-argument constructor
    public Rectangle() {
        super(); // Call Shape's no-arg constructor
        this.width = 1.0;
        this.length = 1.0;
    }

    // Constructor with width and length
    public Rectangle(double width, double length) {
        super(); // Call Shape's no-arg constructor
        this.width = width;
        this.length = length;
    }

    // Constructor with color, filled, width, and length
    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    // Getters and setters for width and length
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    // Method to calculate area
    public double getArea() {
        return width * length;
    }

    // Method to calculate perimeter
    public double getPerimeter() {
        return 2 * (width + length);
    }

    // Override toString method
    @Override
    public String toString() {
        return "A Rectangle with width=" + width + " and length=" + length + ", which is a subclass of " + super.toString();
    }
}