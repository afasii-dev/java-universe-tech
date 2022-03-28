package main.inheritance;

public class Plane extends Vehicle {

    @Override
    public void start() {
        System.out.println("Plane is started.");
    }

    @Override
    public void stop() {
        System.out.println("Plane is stopped.");
    }

    @Override
    public void action() {
        System.out.println("Plane is on the autopilot.");
    }

    @Override
    public void message(String engine) {
        System.out.println("All the engines are working fine.");
    }
}