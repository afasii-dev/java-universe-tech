package main.oop.abstractClass;

public abstract class Vehicle {

    private String bodyType;
    private int year;
    private String fuelType;

    public void drive() {
        System.out.println("We are driving!");
    }

    public void leftAndRight() {
        System.out.println("We are turning!");
    }

    public void stop() {
        System.out.println("Stop right here!");
    }

    public void back() {
        System.out.println("Drive back!");
    }

    abstract void purpose();
}
