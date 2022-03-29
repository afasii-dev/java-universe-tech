package main.inheritance;

public class Train extends Vehicle {

    @Override
    public void start(String start) {
        System.out.println("Train is started to move.");
    }

    @Override
    public void stop(String stop) {
        System.out.println("Train Made an emergency stop!!!");
    }

    @Override
    public void action() {
        System.out.println("Train is on the autopilot.");
    }

    @Override
    public void message() {
        System.out.println("Train is giving an engine error.");
    }
}