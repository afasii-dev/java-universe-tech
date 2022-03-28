package main.oop.inheritanceExample;

public class Main {
    public static void main(String[] args) {
        Human human = new Human();
        human.setName("Alex");
        human.setAge(99);
        System.out.println(human);

        human.sayHello();
        human.go();
        human.eat();

        Developer developer = new Developer();
        developer.setName("Iqbol");
        developer.setAge(24);
        System.out.println(developer);

        developer.sayHello();
        developer.go();
        developer.eat();

        Tester tester = new Tester();
        tester.setName("Ibrohimjon");
        tester.setAge(20);
        System.out.println(tester);

        tester.sayHello();
        tester.go();
        tester.eat();

//        Access modifiers
//        1. public
//        2. default (package visible)
//        3. protected
//        4. private
    }
}
