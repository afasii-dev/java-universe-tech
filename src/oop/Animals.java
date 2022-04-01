package oop;

public abstract class Animals {
    private String name;
    private int age;
    private int weight;

    abstract void voice();

    public String getName() {
        return name;
    }

    public void setName(String  newName) {
        name = newName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int  newAge) {
        age = newAge;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int  newWeight) {
         weight = newWeight;
    }



    public void go(){
        System.out.println("going");
    }

    public void run(){
        System.out.println("running");
    }

    public void stop(){
        System.out.println("stopping");
    }

}
