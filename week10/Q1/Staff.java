package Q1;

public class Staff extends Person {
    private String school;
    private double pay;

    public Staff(String name, String address, String school, double pay) {
        super(name, address);
        this.school = school;
        this.pay = pay;
    }
    public String getSchool() {
        return school;
    }
    public void setSchool() {
        this.school = school;
    }
    public double getPay() {
        return pay;
    }
    public void setPay() {
        this.pay = pay;
    }
    @Override
    public String toString() {
        return "name='" + getName() + '\'' + 
                ", address='" + getAddress() + '\'' + 
                ", school='" + school + '\'' +
                ", pay=" + pay;
    }
}
