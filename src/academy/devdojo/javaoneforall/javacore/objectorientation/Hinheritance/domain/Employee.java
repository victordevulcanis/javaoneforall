package academy.devdojo.javaoneforall.javacore.objectorientation.Hinheritance.domain;

public class Employee {

    private String name;
    private String socialNumber;
    private Address address;
    private double salary;

    public void print(){
        System.out.println("------------");
        System.out.println("Name: " + this.name);
        System.out.println("Social Number: " + this.socialNumber);
        System.out.println("Salary: " + this.salary);
        System.out.println("Address: " + this.address.getStreet());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSocialNumber() {
        return socialNumber;
    }

    public void setSocialNumber(String socialNumber) {
        this.socialNumber = socialNumber;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

}
