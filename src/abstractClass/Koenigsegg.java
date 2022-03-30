package abstractClass;

public class Koenigsegg extends AbstractClassCar{
    @Override
    public void gas() {
        System.out.println("gas Koenigsegg");
    }

    @Override
    public void brake() {
        System.out.println("Stop Koenigsegg ");
    }
}
