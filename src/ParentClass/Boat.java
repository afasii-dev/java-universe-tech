package ParentClass;

public class Boat extends Vehicle {
    @Override
    public void start() {
        System.out.println("Start working now, all boats!");
    }

    @Override
    public void stop() {
        System.out.println("Stop working evening, all boats!");
    }
}
