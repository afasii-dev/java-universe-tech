package oop;

public class Cat {
    private String breed;
    private String lifespan;
    private String color;
    private int weight;

    public void voice() {
        System.out.println("it's screaming...");
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

    public Cat() {

    }

    public Cat(String breed, String lifespan, String color, int weight) {
        this.breed = breed;
        this.lifespan = lifespan;
        this.color = color;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Cat{ " +
                "breed =' " + breed + '\'' +
                ", lifespan =' " + lifespan + '\'' +
                ", color =' " + color + '\'' +
                ", weight = " + weight +
                '}';
    }
}