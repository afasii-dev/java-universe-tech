package main.inheritance;

public class Boat extends Vehicle {

    @Override
    public void start() {
        System.out.println("Boat is started.");
    }

    @Override
    public void stop() {
        System.out.println("Boat is stopped.");
    }

    @Override
    public void action() {
        System.out.println("Boat is on the autopilot.");
    }

    @Override
    public void message() {
        System.out.println("Ready to dive.");
    }
}