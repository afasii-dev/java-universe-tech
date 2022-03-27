package parentClassHomeWork;

public class Car extends Vehicle{
    @Override
    public  void start(){
        System.out.println("1)start Car");
    }
    @Override
    public void stop(){
        System.out.println("2)stop Car");
    }
    @Override
    public void action(){
        System.out.println("3)action Car");
    }
    @Override
    public void message(){
        System.out.println("4)message Car\n-------------");
    }
}
