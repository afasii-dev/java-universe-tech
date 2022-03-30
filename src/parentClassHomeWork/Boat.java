package parentClassHomeWork;

public class Boat extends Vehicle {
    String name;
    int speed;
    String color;

    public Boat() {
    }

    public Boat(String name) {
        this.name = name;
    }

    public Boat(String name, int speed, String color) {
        this.name = name;
        this.speed = speed;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Boat{" +
                "name='" + name + '\'' +
                ", speed=" + speed +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void start() {
        System.out.println("1)start Boat");
    }

    @Override
    public void stop() {
        System.out.println("2)stop Boat");
    }

    @Override
    public void action() {
        System.out.println("3)action Boat");
    }

    @Override
    public void message() {
        System.out.println("4)message Boat\n-------------");
    }
}
