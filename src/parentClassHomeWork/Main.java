package parentClassHomeWork;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.start();
        vehicle.stop();
        vehicle.action();
        vehicle.message();


        Boat boat = new Boat();
        boat.start();
        boat.stop();
        boat.action();
        boat.message();


        Plane plane = new Plane();
        plane.start();
        plane.stop();
        plane.action();
        plane.message();


        Car car = new Car();
        car.start();
        car.stop();
        car.action();
        car.message();


        Train train = new Train();
        train.start();
        train.stop();
        train.action();
        train.message();
    }
}
