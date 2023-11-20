package academy.devdojo.javaoneforall.javacore.objectorientation.Hinheritance.domain;

public class Manager extends Employee {

    private String department;

    @Override
    public void print(){
        super.print();
        System.out.println("Department: " + this.department);
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

}
