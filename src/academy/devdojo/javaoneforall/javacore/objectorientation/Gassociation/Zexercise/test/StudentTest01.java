package academy.devdojo.javaoneforall.javacore.objectorientation.Gassociation.Zexercise.test;

import academy.devdojo.javaoneforall.javacore.objectorientation.Gassociation.Zexercise.domain.Student;

public class StudentTest01 {

    public static void main(String[] args) {

        Student student = new Student("Harry Potter", 15);

        student.print();

        System.out.println(student.getName());
        System.out.println(student.getAge());

    }
}
