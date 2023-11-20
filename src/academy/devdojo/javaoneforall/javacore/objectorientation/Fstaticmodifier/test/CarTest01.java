package academy.devdojo.javaoneforall.javacore.objectorientation.Fstaticmodifier.test;

import academy.devdojo.javaoneforall.javacore.objectorientation.Fstaticmodifier.domain.Car;

public class CarTest01 {

    public static void main(String[] args) {

        Car.setSpeedLimit(350);

        System.out.println(Car.getSpeedLimit());

        Car car = new Car("BMW", 250);
        Car car1 = new Car("Mercedes", 260);
        Car car2 = new Car("Audi", 270);

        car.print();
        car1.print();
        car2.print();

    }

}
