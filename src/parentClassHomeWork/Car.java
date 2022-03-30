package parentClassHomeWork;

public class Car extends Vehicle {
    String name;
    int speed;
    String color;
    String year;

    public Car() {
    }

    public Car(String name) {
        this.name = name;
    }

    public Car(String name, int speed, String color, String year) {
        this.name = name;
        this.speed = speed;
        this.color = color;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", speed=" + speed +
                ", color='" + color + '\'' +
                ", year='" + year + '\'' +
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

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    @Override
    public void start() {
        System.out.println("1)start Car");
    }

    @Override
    public void stop() {
        System.out.println("2)stop Car");
    }

    @Override
    public void action() {
        System.out.println("3)action Car");
    }

    @Override
    public void message() {
        System.out.println("4)message Car\n-------------");
    }
}
