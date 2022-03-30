package abstractClass;

public class Pagani extends AbstractClassCar{
    @Override
    public void gas() {
        System.out.println("gas Pagani");
    }

    @Override
    public void brake() {
        System.out.println("Stop Pagani");
    }
}
