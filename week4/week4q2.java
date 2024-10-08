import java.util.*;
import java.io.*;
    class Employee {
        private String name;
        private int id;
        private int dept;
        private double allowance;
        private double basic;
        private double totalSalary;

        public Employee(String name, int id, int dept, double basic) {
            this.name = name;
            this.id = id;
            this.dept = dept;
            this.basic = basic;
        }
        public void calculateSalary() {
            double hra = (this.basic * 0.4);

            switch (this.dept) {
                case 1:
                this.allowance = 1500;
                break;
                case 2:
                this.allowance = 2500;
                break;
                case 3:
                this.allowance = 3500;
                break;
                default:
                this.allowance = 0;
                System.out.println("Invalid department");
            }

            this.totalSalary = this.basic + this.allowance + hra;
        }

        public void displayDetails() {
            System.out.println("\n--- Employee Details ---");
            System.out.println("Name: " + this.name);
            System.out.println("ID: " + this.id);
            System.out.println("Department: " + this.dept);
            System.out.println("Basic Salary: " + this.basic);
            System.out.println("HRA: " + this.basic * 0.4);
            System.out.println("Allowance: " + this.allowance);
            System.out.println("Total Salary: " + this.totalSalary);
    }
}
public class week4q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Taking input from user
        Employee[] emp  = new Employee[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("\nEnter details of employee " + (i +1) + "i");
            
            System.out.println("Enter name:");
            String name = sc.nextLine();
            
            System.out.println("Enter ID: ");
            int id = sc.nextInt();

            System.out.println("Enter department (1 for staff / 2 for accounts / 3 for admin): ");
            int dept = sc.nextInt();

            System.out.println("Enter basic salary: ");
            double basic = sc.nextDouble();

            sc.nextLine();

            emp[i] = new Employee(name, id, dept, basic);
        }

        for  (int i = 0; i < emp.length; i++) {
            emp[i].calculateSalary();
            emp[i].displayDetails();
        }
    }
}
