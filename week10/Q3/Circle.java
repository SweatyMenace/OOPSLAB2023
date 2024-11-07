package Q3;

public class Circle extends Shape {
    private double radius;

    // No-argument constructor
    public Circle() {
        super(); // Call Shape's no-arg constructor
        this.radius = 1.0;
    }

    // Constructor with radius
    public Circle(double radius) {
        super(); // Call Shape's no-arg constructor
        this.radius = radius;
    }

    // Constructor with color, filled, and radius
    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    // Getter and setter for radius
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Method to calculate area
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // Method to calculate perimeter
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    // Override toString method
    @Override
    public String toString() {
        return "A Circle with radius=" + radius + ", which is a subclass of " + super.toString();
    }
}