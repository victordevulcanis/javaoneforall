package academy.devdojo.javaoneforall.javacore.objectorientation.Gassociation.Zexercise.test;

import academy.devdojo.javaoneforall.javacore.objectorientation.Gassociation.Zexercise.domain.Professor;

public class ProfessorTest01 {

    public static void main(String[] args) {

        Professor professor = new Professor("John Doe", "Science");

        professor.print();

        System.out.println(professor.getName());

        System.out.println(professor.getResearchField());

    }
}
