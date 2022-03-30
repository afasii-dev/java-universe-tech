package abstractClass;

public abstract class AbstractClassCar {
   private String model;
   private String color;

    public abstract void gas();

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMaxSpeed(int maxSpeed) {
        return maxSpeed;
    }

    public String getColor(String color) {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract void brake();
}
