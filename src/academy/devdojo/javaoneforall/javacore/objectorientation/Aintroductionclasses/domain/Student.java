package academy.devdojo.javaoneforall.javacore.objectorientation.Aintroductionclasses.domain;

public class Student {

    private int age;
    private char gender;
    private String name;

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }

    public String getName() {
        return name;
    }
}
