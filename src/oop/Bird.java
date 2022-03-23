package oop;

public class Bird {
    private String name;
    private String lifespan;
    private String divingSpeed;
    private float weight;

    public void fly() {
        System.out.println("It's flying...");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLifespan() {
        return lifespan;
    }

    public void setLifespan(String lifespan) {
        this.lifespan = lifespan;
    }

    public String getDivingSpeed() {
        return divingSpeed;
    }

    public void setDivingSpeed(String divingSpeed) {
        this.divingSpeed = divingSpeed;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public Bird() {

    }
    public Bird(String name, String lifespan, String divingSpeed, float weight) {
        this.name = name;
        this.lifespan = lifespan;
        this.divingSpeed = divingSpeed;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Bird{ " +
                "name =' " + name + '\'' +
                ", lifespan =' " + lifespan + '\'' +
                ", divingSpeed =' " + divingSpeed + '\'' +
                ", weight = " + weight +
                '}';
    }
}
