class Person implements Comparable<Person> {
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Implementing the compareTo method
    @Override
    public int compareTo(Person other) {
        return Integer.compare(this.age, other.age);
    }

    // Method to display person details
    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}

public class PersonComparison {
    public static void main(String[] args) {
        // Creating two Person objects
        Person person1 = new Person("Alice", 25);
        Person person2 = new Person("Bob", 30);

        // Comparing their ages
        int comparisonResult = person1.compareTo(person2);

        // Printing the comparison result
        if (comparisonResult == 0) {
            System.out.println(person1.getName() + " and " + person2.getName() + " are of the same age.");
        } else if (comparisonResult < 0) {
            System.out.println(person2.getName() + " is elder than " + person1.getName() + ".");
        } else {
            System.out.println(person1.getName() + " is elder than " + person2.getName() + ".");
        }
    }
}