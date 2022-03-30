package abstractClass;

public class Bmw extends AbstractClassCar {
    @Override
    public void gas() {
        System.out.println("Bmw gas");
    }

    @Override
    public void brake() {
        System.out.println("Stop BMW");
    }
}
