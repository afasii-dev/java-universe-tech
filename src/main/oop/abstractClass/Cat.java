package main.oop.abstractClass;

public class Cat extends Animal {

    String name;
    int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void voice() {
        System.out.println("Meow!");
    }
}
