package main.oop.inheritanceExample;

//Child
public class Tester extends Human {

    @Override
    public void go() {
        System.out.println("Tester is going");
    }

    @Override
    public void eat() {
        System.out.println("Tester i eating");
    }
}
