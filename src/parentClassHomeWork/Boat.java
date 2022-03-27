package parentClassHomeWork;

public class Boat extends Vehicle{
    @Override
    public void start(){
        System.out.println("1)start Boat");
    }
    @Override
    public void stop(){
        System.out.println("2)stop Boat");
    }
    @Override
    public void action(){
        System.out.println("3)action Boat");
    }
    @Override
    public void message(){
        System.out.println("4)message Boat\n-------------");
    }
}
