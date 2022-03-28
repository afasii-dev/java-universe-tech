package ParentClass;

public class Plane extends Vehicle {
    @Override
    public void start() {
        System.out.println("Start working now, all planes!");
    }

    @Override
    public void stop() {
        System.out.println("Stop working evening, all cars!");
    }
}
