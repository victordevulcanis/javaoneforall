package academy.devdojo.javaoneforall.javacore.objectorientation.Labstractcalsses.domain;

public class Developer extends Employee {

    public Developer(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void calculateBonusSalary() {
        this.salary += this.salary * 0.05;
    }
}
