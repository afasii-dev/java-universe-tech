package ParentClass;

public class Train extends Vehicle {
    @Override
    public void start() {
        System.out.println("Start working now, all trains!");
    }

    @Override
    public void stop() {
        System.out.println("Stop working evening, all trains!");
    }
}
