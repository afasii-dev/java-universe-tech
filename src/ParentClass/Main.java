package ParentClass;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.setName("Vehicle");
        vehicle.setColor("Green");
        System.out.println(vehicle);

        vehicle.start();
        vehicle.stop();
        vehicle.action();
        vehicle.message();

        System.out.println("_______________________________");

        Car car = new Car();
        car.setName("Merc");
        car.setColor("Green");
        System.out.println(car);

        car.start();
        car.stop();
        car.action();
        car.message();

        System.out.println("_______________________________");

        Plane plane = new Plane();
        plane.setName("Airbus A321");
        plane.setColor("White");
        System.out.println(plane);

        plane.start();
        plane.stop();
        plane.action();
        plane.message();

        System.out.println("_______________________________");

        Train train = new Train();
        train.setName("Train");
        train.setColor("Yellow");
        System.out.println(train);

        train.start();
        train.stop();
        train.action();
        train.message();

        System.out.println("_______________________________");

        Boat boat = new Boat();
        boat.setName("Яхта");
        boat.setColor("Blue");
        System.out.println(boat);

        boat.start();
        boat.stop();
        boat.action();
        boat.message();

        System.out.println("_______________________________");


    }
}
