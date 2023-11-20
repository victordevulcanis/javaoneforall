package academy.devdojo.javaoneforall.javacore.objectorientation.Aintroductionclasses.domain;

public class Car {

    private String name;
    private String model;
    private int year;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void printDetails(){
        System.out.println("Name: " + this.getName() +
                "\nModel: " + this.getModel() +
                "\nYear: " + this.getYear() +
                "\n_____________________________");
    }



}
