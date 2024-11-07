package Q1;

class Person {
    private String name;
    private String address;

    public Person(String name, String address) {
        this.name = name;
        this.address = address; 
    }
    
    public String getName() {
        return name;    
    }

    public String getAddress() {
        return address;
    }

    public void setAddress() {
        this.address = address;
    }

    @Override
    public String toString() {
        return "name='" + name + "', address='" + address + "'";
    }
}

public class Main {
    public static void main(String[] args) {
        Person person = new Person("John", "123 Main St");
        System.out.println(person);  

        Student student = new Student("John Doe", "123 Main St", "Computer Science", 2, 15000.00);
        System.out.println(student);

        Staff staff = new Staff("John Doe", "123 Main St", "Springfield High", 50000.0);
        System.out.println(staff);
    }
}
