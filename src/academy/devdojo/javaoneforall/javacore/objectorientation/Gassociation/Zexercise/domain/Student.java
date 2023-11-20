package academy.devdojo.javaoneforall.javacore.objectorientation.Gassociation.Zexercise.domain;

public class Student {

    private String name;
    private Seminar seminar;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void print(){
        System.out.println("--- Student ---");
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        if(seminar != null){
            System.out.println("Seminar: " + this.seminar.getTitle());
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Seminar getSeminar() {
        return seminar;
    }

    public void setSeminar(Seminar seminar) {
        this.seminar = seminar;
    }

}
