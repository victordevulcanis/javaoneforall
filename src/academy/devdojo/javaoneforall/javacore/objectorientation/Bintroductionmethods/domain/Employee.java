package academy.devdojo.javaoneforall.javacore.objectorientation.Bintroductionmethods.domain;

public class Employee {

    public String name;
    public int age;
    public double[] salaries;

    public void print() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.print("Salaries: ");
        if (salaries != null) {
            for (double salary : salaries) {
                System.out.print(salary + "  ");
            }
        }
    }

    public void calculateAndPrintAverageSalaries(){
        double average = 0;
        if (salaries != null) {
            for (double salary : salaries) {
                average += salary;
            }
            average /= salaries.length;
            System.out.println("The average salary is " + average);
        }
    }

}
