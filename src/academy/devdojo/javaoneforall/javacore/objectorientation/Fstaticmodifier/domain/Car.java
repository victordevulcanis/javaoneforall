package academy.devdojo.javaoneforall.javacore.objectorientation.Fstaticmodifier.domain;

public class Car {

    private String name;
    private int maximumSpeed;
    private static int speedLimit = 350;

    public Car(String name, int maximumSpeed) {
        this.name = name;
        this.maximumSpeed = maximumSpeed;
    }

    public void print() {
        System.out.println("-----------------------------------");
        System.out.println("Name: " + this.name);
        System.out.println("Maximum Speed: " + this.maximumSpeed);
        System.out.println("Speed Limit: " + Car.speedLimit);
    }

    public static void setSpeedLimit(int speedLimit){
        Car.speedLimit = speedLimit;
    }

    public static int getSpeedLimit(){
        return Car.speedLimit;
    }


}
