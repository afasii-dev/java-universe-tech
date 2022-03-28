package ParentClass;

public class Vehicle {
    String name;
    private String color;

    public Vehicle() {

    }

    public Vehicle(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getKind() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void start() {
        System.out.println("Start working now, all vehicles!");
    }

    public void stop() {
        System.out.println("Stop working evening, all vehicles!");
    }

    final void action() {
        System.out.println("Get ready for action!");
    }

    final void message() {
        System.out.println("I'll give messages.");
    }

    @Override
    public String toString() {
        return "name : " + name +
                "\ncolor : " + color;
    }
}