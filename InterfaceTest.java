
interface Vehicle{

    final int wheel = 4;
    final String colour = "red";
     static final String name = "Vehicle";

    abstract void run();

  }

class Car1 implements Vehicle{

    @Override
    public void run() {
        System.out.println("Car running");
    }


}

class Auto1 implements Vehicle{

    @Override
    public void run() {
        System.out.println("Auto running");
    }
}

class RepairShop{
    public static void repair(Vehicle v){
        v.run();
    }
}


public class InterfaceTest {

    public static void main(String[] args) {
        System.out.println(Vehicle.name );
        System.out.println(Vehicle.wheel );

        Vehicle v = new Car1();
        RepairShop.repair(v);

        v = new Auto1();
        RepairShop.repair(v);
    }
}
