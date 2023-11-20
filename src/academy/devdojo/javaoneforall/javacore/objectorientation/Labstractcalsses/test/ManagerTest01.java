package academy.devdojo.javaoneforall.javacore.objectorientation.Labstractcalsses.test;

import academy.devdojo.javaoneforall.javacore.objectorientation.Labstractcalsses.domain.Manager;

public class ManagerTest01 {

    public static void main(String[] args) {

        Manager manager = new Manager("John Doe", 6000);

        System.out.println("testing getName");
        System.out.println(manager.getName());
        System.out.println("----------------");

        System.out.println("testing getSalary");
        System.out.println(manager.getSalary());
        System.out.println("----------------");

        System.out.println("testing print()");
        manager.print();
        System.out.println("----------------");

        System.out.println("testing toString()");
        System.out.println(manager);
        System.out.println("----------------");

    }
}
