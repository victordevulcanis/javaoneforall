package academy.devdojo.javaoneforall.javacore.objectorientation.Aintroductionclasses.test;

import academy.devdojo.javaoneforall.javacore.objectorientation.Aintroductionclasses.domain.Student;

public class StudentTest01 {

    public static void main(String[] args) {

        Student student = new Student();
        student.setAge(21);
        student.setGender('M');
        student.setName("Luffy");

//        System.out.println(student.getAge());
//        System.out.println(student.getGender());
//        System.out.println(student.getName());

        System.out.println("Name: " + student.getName() +
                "\nAge: " + student.getAge() +
                "\nGender: " + student.getGender());

    }
}
