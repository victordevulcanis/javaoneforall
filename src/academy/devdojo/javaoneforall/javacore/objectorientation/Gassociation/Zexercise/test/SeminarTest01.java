package academy.devdojo.javaoneforall.javacore.objectorientation.Gassociation.Zexercise.test;

import academy.devdojo.javaoneforall.javacore.objectorientation.Gassociation.Zexercise.domain.Place;
import academy.devdojo.javaoneforall.javacore.objectorientation.Gassociation.Zexercise.domain.Professor;
import academy.devdojo.javaoneforall.javacore.objectorientation.Gassociation.Zexercise.domain.Seminar;
import academy.devdojo.javaoneforall.javacore.objectorientation.Gassociation.Zexercise.domain.Student;

public class SeminarTest01 {

    public static void main(String[] args) {

        Student student1 = new Student("Harry Potter", 15);
        Student student2 = new Student("Hermione Granger", 15);
        Student student3 = new Student("Ron Weasley", 15);
        Student student4 = new Student("Draco Malfoy", 15);

        Student[] studentsTransfigurationSeminar = {student1, student2, student3};
        Student[] studentsCounterCursesSeminar = {student4};

        Professor professor1 = new Professor("Severus Snape", "Counter-Curses");
        Professor professor2 = new Professor("Sybill Trelawney", "Divination");
        Professor professor3 = new Professor("Minerva McGonagall", "Transfiguration");

        Place place1 = new Place("Gryffindor Common Room");
        Place place2 = new Place("The Hogwarts Library");
        Place place3 = new Place("The Great Hall");

        Seminar seminar1 = new Seminar("Transfiguration", place1, professor3);
        Seminar seminar2 = new Seminar("Divination", place2, professor2);
        Seminar seminar3 = new Seminar("Counter-Curses", place3, professor1);

        seminar1.setStudents(studentsTransfigurationSeminar);
        student1.setSeminar(seminar1);
        student2.setSeminar(seminar1);
        student3.setSeminar(seminar1);

        Seminar[] seminarProfessorMinerva = {seminar1};
        professor3.setSeminars(seminarProfessorMinerva);

        seminar3.setStudents(studentsCounterCursesSeminar);
        student4.setSeminar(seminar3);

        seminar1.print();
        student1.print();
        student2.print();
        student3.print();

        seminar2.print();

        seminar3.print();
        student4.print();

        professor3.print();


    }

}
