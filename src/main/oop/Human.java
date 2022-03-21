package main.oop;

public class Human {
    private String name;
    private String sex;
    private int age;
    private String profession;

    public void go() {
        System.out.println("I'm going...");
    }

    public void stop() {
        System.out.println("Stop");
    }

    public Human() {

    }

    public Human(String name, String sex, int age, String profession) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.profession = profession;
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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    @Override
    public String toString() {
        return "name: " + name +
                "\nage : " + age +
                "\nsex : " + sex +
                "\nprofession : " + profession;
    }
}
