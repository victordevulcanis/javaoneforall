package academy.devdojo.javaoneforall.javacore.objectorientation.Labstractcalsses.domain;

public abstract class Employee extends Person {

    protected String name;
    protected double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
        this.calculateBonusSalary();
    }

    public abstract void calculateBonusSalary();

    public void print(){
        System.out.println("Name: " + this.name);
        System.out.println("Salary: " + this.salary);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return this.name;
    }

}
