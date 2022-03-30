package parentClassHomeWork;

public class Train extends Vehicle {
    String name;
    int speed;
    String color;

    public Train(String name, int speed, String color) {
        this.name = name;
        this.speed = speed;
        this.color = color;
    }

    public Train(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Train{" +
                "name='" + name + '\'' +
                ", speed=" + speed +
                ", color='" + color + '\'' +
                '}';
    }

    public Train() {

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
        System.out.println("1)start Train");
    }

    @Override
    public void stop() {
        System.out.println("2)stop Train");
    }

    @Override
    public void action() {
        System.out.println("3)action Train");
    }

    @Override
    public void message() {
        System.out.println("4)message Train\n-------------");
    }
}
