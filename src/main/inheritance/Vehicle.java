package main.inheritance;

// Parent Class
public class Vehicle {
    private String name;
    private int speed;
    private float weight;

    public Vehicle() {
    }

    public Vehicle(String name) {
        this.name = name;
    }

    public Vehicle(String name, int speed, int weight) {
        this.name = name;
        this.speed = speed;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public void start() {
        System.out.println("Vehicle is started.");
    }

    public void stop() {
        System.out.println("Vehicle is stopped.");
    }

    public void action() {
        System.out.println("Vehicle is on the autopilot.");
    }

    public void message() {
        System.out.println("Vehicle is giving an engine error.");
    }

    public void action(String park) {
        System.out.println("Car can park itself");
    }

    public void message(String engine) {
        System.out.println("All the engines are working fine." + engine);
    }

    public void start(String move) {
        System.out.println("Train is started to move." + move);
    }

    public void stop(String emergency) {
        System.out.println("Train Made an emergency stop!!!" + emergency);
    }


    @Override
    public String toString() {
        return "\nVehicle - " +
                "name: " + name + "," +
                " speed: " + speed + "km/h" +
                ", weight: " + weight + ".";
    }
}