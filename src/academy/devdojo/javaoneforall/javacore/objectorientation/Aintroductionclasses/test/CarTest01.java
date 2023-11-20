package academy.devdojo.javaoneforall.javacore.objectorientation.Aintroductionclasses.test;

import academy.devdojo.javaoneforall.javacore.objectorientation.Aintroductionclasses.domain.Car;

public class CarTest01 {

    public static void main(String[] args) {

        Car car1 = new Car();
        car1.setModel("Equinox");
        car1.setName("Chevrolet");
        car1.setYear(2023);

        Car car2 = new Car();
        car2.setModel("RX");
        car2.setName("Lexus");
        car2.setYear(2023);

        System.out.println("Car 1:");
        car1.printDetails();

        System.out.println("Car 2:");
        car2.printDetails();


    }

}
