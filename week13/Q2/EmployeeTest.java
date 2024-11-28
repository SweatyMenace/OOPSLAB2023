
class InvalidNameException extends Exception {
    public InvalidNameException(String message) {
        super(message);
    }
}

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

class InvalidDepartmentException extends Exception {
    public InvalidDepartmentException(String message) {
        super(message);
    }
}

class InvalidMobileNoException extends Exception {
    public InvalidMobileNoException(String message) {
        super(message);
    }
}

class Employee {
    private String name;
    private int age;
    private int department; // 1 to 4
    private String mobileno;

    public Employee(String name, int age, int department, String mobileno) throws InvalidNameException, InvalidAgeException, InvalidDepartmentException, InvalidMobileNoException {
        setName(name);
        setAge(age);
        setDepartment(department);
        setMobileno(mobileno);
    }

    public void setName(String name) throws InvalidNameException {
        if (!name.matches("[a-zA-Z]+")) {
            throw new InvalidNameException("Invalid name: Name must contain only letters.");
        }
        this.name = name;
    }

    public void setAge(int age) throws InvalidAgeException {
        if (age <= 18) {
            throw new InvalidAgeException("Invalid age: Age must be greater than 18.");
        }
        this.age = age;
    }

    public void setDepartment(int department) throws InvalidDepartmentException {
        if (department < 1 || department > 4) {
            throw new InvalidDepartmentException("Invalid department: Department must be between 1 and 4.");
        }
        this.department = department;
    }

    public void setMobileno(String mobileno) throws InvalidMobileNoException {
        if (!mobileno.matches("\\d{10}")) {
            throw new InvalidMobileNoException("Invalid mobile number: Mobile number must be 10 digits.");
        }
        this.mobileno = mobileno;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", department=" + department +
                ", mobileno='" + mobileno + '\'' +
                '}';
    }
}

public class EmployeeTest {
    public static void main(String[] args) {
        try {
            Employee emp1 = new Employee("John", 25, 2, "1234567890");
            System.out.println(emp1);
        } catch (InvalidNameException | InvalidAgeException | InvalidDepartmentException | InvalidMobileNoException e) {
            System.out.println(e.getMessage());
        }

        try {
            Employee emp2 = new Employee("Jane123", 17, 5, "12345");
        } catch (InvalidNameException | InvalidAgeException | InvalidDepartmentException | InvalidMobileNoException e) {
            System.out.println(e.getMessage());
        }
    }
}
