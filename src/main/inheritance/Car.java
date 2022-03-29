package main.inheritance;

public class Car extends Vehicle {

    @Override
    public void start() {
        System.out.println("Car is started.");
    }

    @Override
    public void stop() {
        System.out.println("Car is stopped.");
    }

    @Override
    public void action() {
        System.out.println("Car is on the autopilot.");
    }

    @Override
    public void action(String action) {
        System.out.println("Car can park itself.");
    }

    @Override
    public void message() {
        System.out.println("Car is giving an engine error.");
    }
}