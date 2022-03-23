package oop;

public class Dog {
    private String breed;
    private String lifespan;
    private String color;
    private int weight;

    public void run() {
        System.out.println("It's Running...");
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getLifespan() {
        return lifespan;
    }

    public void setLifespan(String lifespan) {
        this.lifespan = lifespan;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Dog() {

    }
    public Dog(String breed, String lifespan, String color, int weight) {
        this.breed = breed;
        this.lifespan = lifespan;
        this.color = color;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Dog{ " +
                "breed =' " + breed + '\'' +
                ", lifespan =' " + lifespan + '\'' +
                ", color =' " + color + '\'' +
                ", weight = " + weight +
                '}';
    }
}
