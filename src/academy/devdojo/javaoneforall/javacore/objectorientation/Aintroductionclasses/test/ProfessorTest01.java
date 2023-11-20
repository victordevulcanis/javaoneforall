package academy.devdojo.javaoneforall.javacore.objectorientation.Aintroductionclasses.test;

import academy.devdojo.javaoneforall.javacore.objectorientation.Aintroductionclasses.domain.Professor;

public class ProfessorTest01 {

    public static void main(String[] args) {

        Professor professor = new Professor();
        professor.setAge(150);
        professor.setGender('M');
        professor.setName("Kami");

        System.out.println(professor.getAge());
        System.out.println(professor.getGender());
        System.out.println(professor.getName());

    }
}
