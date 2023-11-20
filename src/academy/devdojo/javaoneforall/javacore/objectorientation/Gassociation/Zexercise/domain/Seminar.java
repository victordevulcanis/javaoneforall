package academy.devdojo.javaoneforall.javacore.objectorientation.Gassociation.Zexercise.domain;

public class Seminar {

    private String title;
    private Student[] students;
    private Place place;
    private Professor professor;

    public Seminar(String title, Place place, Professor professor) {
        this.title = title;
        this.place = place;
        this.professor = professor;
    }

    public Seminar(String title, Student[] students, Place place, Professor professor) {
        this.title = title;
        this.students = students;
        this.place = place;
        this.professor = professor;
    }

    public void print(){
        System.out.println("--- Seminar ---");
        System.out.println("Title: " + this.title);
        System.out.println("Professor: " + this.professor.getName());
        if(this.students != null){
            System.out.print("Students: ");
            for(Student student : students){
                System.out.print("[" + student.getName() + "]");
            }
            System.out.print("\n");
        }
        System.out.println("Place: " + this.place.getAddress());
    }

    public String getTitle() {
        return title;
    }


    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public Place getPlace() {
        return place;
    }

    public void setPlace(Place place) {
        this.place = place;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessors(Professor professor) {
        this.professor = professor;
    }

}
