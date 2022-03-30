package oop;

public abstract class Animals {
    public String name;
    public int age;
    public int weight;

    abstract  void voice();

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
