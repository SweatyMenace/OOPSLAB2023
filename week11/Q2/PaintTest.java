// Define the Paint interface
interface Paint {
    void color(); // Method declaration
}

// Class Red implementing Paint interface
class Red implements Paint {
    @Override
    public void color() {
        System.out.println("Color is Red");
    }
}

// Class Green implementing Paint interface
class Green implements Paint {
    @Override
    public void color() {
        System.out.println("Color is Green");
    }
}

// Class Blue implementing Paint interface
class Blue implements Paint {
    @Override
    public void color() {
        System.out.println("Color is Blue");
    }
}

// Main class to test the implementation
public class PaintTest {
    public static void main(String[] args) {
        Paint red = new Red();   // Create an object of Red
        Paint green = new Green(); // Create an object of Green
        Paint blue = new Blue();   // Create an object of Blue

        // Call the color method on each object
        red.color();    // Output: Color is Red
        green.color();  // Output: Color is Green
        blue.color();   // Output: Color is Blue
    }
}