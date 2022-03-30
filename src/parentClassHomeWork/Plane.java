package parentClassHomeWork;

public class Plane extends Vehicle {
    String name;
    int speed;
    String color;

    public Plane() {
    }

    public Plane(String name, int speed, String color) {
        this.name = name;
        this.speed = speed;
        this.color = color;
    }

    public Plane(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Plane{" +
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
        System.out.println("1)start Plane");
    }

    @Override
    public void stop() {
        System.out.println("2)stop plane");
    }

    @Override
    public void action() {
        System.out.println("3)action plane");
    }

    @Override
    public void message() {
        System.out.println("4)message plane\n-------------");
    }

}
