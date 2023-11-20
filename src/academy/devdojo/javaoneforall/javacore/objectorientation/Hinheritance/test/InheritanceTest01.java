package academy.devdojo.javaoneforall.javacore.objectorientation.Hinheritance.test;

import academy.devdojo.javaoneforall.javacore.objectorientation.Hinheritance.domain.Address;
import academy.devdojo.javaoneforall.javacore.objectorientation.Hinheritance.domain.Employee;
import academy.devdojo.javaoneforall.javacore.objectorientation.Hinheritance.domain.Manager;

public class InheritanceTest01 {

    public static void main(String[] args) {

        Address kameHouse = new Address("Kame House", "123-3");

        Employee employee = new Employee();
        employee.setAddress(kameHouse);
        employee.setName("Goku");
        employee.setSocialNumber("12312312312");
        employee.setSalary(999);

        Manager manager = new Manager();
        manager.setAddress(kameHouse);
        manager.setSalary(1000);
        manager.setSocialNumber("12312312312312");
        manager.setDepartment("Martial Arts");
        manager.setName("Master Roshi");


        employee.print();

        manager.print();

    }

}
