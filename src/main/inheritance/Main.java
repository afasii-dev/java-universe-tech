package main.inheritance;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.setName("Bugatti Divo");
        car.setSpeed(380);
        car.setWeight(1960);
        System.out.println(car);

        car.start();
        car.stop();
        car.action();
        car.action("");
        car.message();

        Plane plane = new Plane();
        plane.setName("Airbus a321");
        plane.setSpeed(876);
        plane.setWeight(48.500f);
        System.out.println(plane);

        plane.start();
        plane.stop();
        plane.action();
        plane.message("");

        Boat boat = new Boat();
        boat.setName("Speedboat");
        boat.setSpeed(61);
        boat.setWeight(4050.5f);
        System.out.println(boat);

        boat.start();
        boat.stop();
        boat.action();
        boat.message();

        Train train = new Train();
        train.setName("Taj-Express");
        train.setSpeed(400);
        train.setWeight(10000);
        System.out.println(train);

        train.start();
        train.stop();
        train.action();
        train.message();
    }
}