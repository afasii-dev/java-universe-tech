package ParentClass;

public class Car extends Vehicle {
    @Override
    public void start() {
        System.out.println("Start working now, all cars!");
    }

    @Override
    public void stop() {
        System.out.println("Stop working evening, all cars!");
    }
}

