package main.oop.abstractClass;

public abstract class Vehicle {

    private String bodyType;
    private int year;
    private String fuelType;

    void drive() {
        System.out.println("We are driving!");
    }
    void left() {
        System.out.println("Turn to the left!");
    }
    void right() {
        System.out.println("Turn to the right!");
    }
    void back() {
        System.out.println("Drive back!");
    }

    abstract void purpose();
}
