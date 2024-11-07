package Q3;

public class Main {
    public static void main(String[] args) {
        // Test Shape class
        Shape shape = new Shape();
        System.out.println(shape); // A Shape with color of green and filled

        shape.setColor("red");
        shape.setFilled(false);
        System.out.println(shape); // A Shape with color of red and Not filled

        // Test Circle class
        Circle circle = new Circle();
        System.out.println(circle); // A Circle with radius=1.0, which is a subclass of A Shape with color of green and filled
        circle.setRadius(5.0);
        System.out.println("Circle area: " + circle.getArea()); // Circle area: 78.53981633974483
        System.out.println("Circle perimeter: " + circle.getPerimeter()); // Circle perimeter: 31.41592653589793

        // Test Rectangle class
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle); // A Rectangle with width=1.0 and length=1.0, which is a subclass of A Shape with color of green and filled
        rectangle.setWidth(4.0);
        rectangle.setLength(3.0);
        System.out.println("Rectangle area: " + rectangle.getArea()); // Rectangle area: 12.0
        System.out.println("Rectangle perimeter: " + rectangle.getPerimeter()); // Rectangle perimeter: 14.0

        // Test Square class
        Square square = new Square(2.0);
        System.out.println(square); // A Square with side=2.0, which is a subclass of A Rectangle with width=2.0 and length=2.0, which is a subclass of A Shape with color of green and filled
        square.setSide(4.0);
        System.out.println("Square area: " + square.getArea()); // Square area: 16.0
        System.out.println("Square perimeter: " + square.getPerimeter()); // Square perimeter: 16.0
    }
}