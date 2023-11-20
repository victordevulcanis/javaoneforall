package academy.devdojo.javaoneforall.javacore.objectorientation.Jfinalmodifier.domain;

public class Car {

    private String name;
    private final static int SPEED_LIMIT = 150;

    public Car(String name) {
        this.name = name;
    }

    public int getSpeedLimit() {
        return Car.SPEED_LIMIT;
    }

    public String toString() {
        return "Name: " + this.name;
    }



}
