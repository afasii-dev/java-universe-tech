package oop;

public class Cat {
    private String kind;
    private int weightInKg;
    private int lengthInCm;
    private String color;

    public void go() {
        System.out.println("Goes to drink milk.");
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public int getWeightInKg() {
        return weightInKg;
    }

    public void setWeightInKg(int weightInKg) {
        this.weightInKg = weightInKg;
    }

    public int getLengthInCm() {
        return lengthInCm;
    }

    public void setLengthInCm(int lengthInCm) {
        this.lengthInCm = lengthInCm;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Cat() {

    }

    public Cat(String kind, int weightInKg, int lengthInCm, String color) {
        this.kind = kind;
        this.weightInKg = weightInKg;
        this.lengthInCm = lengthInCm;
        this.color = color;
    }

    @Override
    public String toString() {
        return "kind : " + kind +
                "\nweightInKg : " + weightInKg +
                "\nlengthInCm : " + lengthInCm +
                "\ncolor : " + color;
    }
}


