package academy.devdojo.javaoneforall.javacore.objectorientation.Labstractcalsses.test;

import academy.devdojo.javaoneforall.javacore.objectorientation.Labstractcalsses.domain.Developer;

public class DeveloperTest01 {

    public static void main(String[] args) {

        Developer developer = new Developer("John Snow", 5000);

        System.out.println("testing getName");
        System.out.println(developer.getName());
        System.out.println("----------------");

        System.out.println("testing getSalary");
        System.out.println(developer.getSalary());
        System.out.println("----------------");

        System.out.println("testing print()");
        developer.print();
        System.out.println("----------------");

        System.out.println("testing toString()");
        System.out.println(developer);
        System.out.println("----------------");

    }
}
