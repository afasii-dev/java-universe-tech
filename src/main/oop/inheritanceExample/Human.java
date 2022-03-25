package main.oop.inheritanceExample;

//Parent
public class Human {

    private String name;
    private int age;

    public Human() {
    }

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void sayHello() {
        System.out.println("Hello!");
    }

    public void go() {
        System.out.println("Human is going");
    }

    public void eat() {
        System.out.println("Human is eating");
    }

    public void eat(String string) {
        System.out.println("Human is eating" + string);
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
