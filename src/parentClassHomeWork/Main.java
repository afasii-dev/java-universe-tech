package parentClassHomeWork;

public class Main {
    public static void main(String[] args) {
        //Vehicle
        Vehicle vehicle = new Vehicle();
        vehicle.name = "";
        vehicle.speed = 0;
        vehicle.color = "";

        vehicle.toString();
        vehicle.start();
        vehicle.stop();
        vehicle.action();
        vehicle.message();
        //Car
        Car car = new Car();
        car.name = "";
        car.speed = 0;
        car.color = "";

        car.toString();
        car.start();
        car.stop();
        car.action();
        car.message();
        //Train
        Train train = new Train();
        train.name = "";
        train.speed = 0;
        train.color = "";

        train.toString();
        train.start();
        train.stop();
        train.action();
        train.message();
        //Plane
        Plane plane = new Plane();
        plane.name = "";
        plane.speed = 0;
        plane.color = "";

        plane.toString();
        plane.start();
        plane.stop();
        plane.action();
        plane.message();
        //Boat
        Boat boat = new Boat();
        boat.name = "";
        boat.speed = 0;
        boat.color = "";

        boat.toString();
        boat.start();
        boat.stop();
        boat.action();
        boat.message();
    }
}
