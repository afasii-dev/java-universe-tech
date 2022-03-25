package main.oop.inheritanceExample;

//Child
public class Developer extends Human {

    @Override
    public void go() {
        System.out.println("Developer is going");
    }

    @Override
    public void eat() {
        System.out.println("Developer is eating");
    }
}
