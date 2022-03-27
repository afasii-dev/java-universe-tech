package parentClassHomeWork;

public class Plane extends Vehicle{
    @Override
    public void start(){
        System.out.println("1)start Plane");
    }
    @Override
    public void stop(){
        System.out.println("2)stop plane");
    }
    @Override
    public void action(){
        System.out.println("3)action plane");
    }
    @Override
    public void message(){
        System.out.println("4)message plane\n-------------");
    }

}
