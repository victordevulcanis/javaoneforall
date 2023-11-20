package academy.devdojo.javaoneforall.javacore.objectorientation.Labstractcalsses.domain;

public class Manager extends Employee {

    public Manager(String name, double salary) {
        super(name, salary);
    }


    @Override
    public void calculateBonusSalary() {
        this.salary += this.salary * 0.1;
    }

}
