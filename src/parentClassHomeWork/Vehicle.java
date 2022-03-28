package parentClassHomeWork;

public class Vehicle {
    String name;
    int speed;
    String color;

    public Vehicle() {
    }

    public Vehicle(String name) {
        this.name = name;
    }

    public Vehicle(String name, int speed, String color) {
        this.name = name;
        this.speed = speed;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                ", speed=" + speed +
                ", color='" + color + '\'' +
                '}';
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void start() {
        System.out.println("1)start Vehicle");
    }

    public void stop() {
        System.out.println("2)Stop vehicle");
    }

    public void action() {
        System.out.println("3)action vehicle");
    }

    public void message() {
        System.out.println("4)message vehicle\n-------------");
    }
}
