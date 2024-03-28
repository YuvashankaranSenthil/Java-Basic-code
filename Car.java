class Vehicle {

    //instance variables
    private int wheel = 10;
    private String colour = "red";

    private String type ;



     public Vehicle(){
         System.out.println("Parent Constructor");
     }

     public Vehicle(int w, String c){
         this.wheel = w;
         this.colour = c;
         System.out.println("Parent param Constructor ");
     }


     public void display1() {
         System.out.println("parent "+this.wheel + " "+this.colour );
     }

     public int getWheel() {
         return wheel;
     }

     public void setWheel(int wheel) {
         this.wheel = wheel;
     }

     public String getColour() {
         return colour;
     }

     public void setColour(String colour) {
         this.colour = colour;
     }

     public String getType() {
         return type;
     }

     public void setType(String type) {
         this.type = type;
     }
 }

class Auto extends Vehicle{

    public Auto(int wheel, String colour){
        super(wheel, colour);
        System.out.println("Child Param Constructor Auto ");
    }

}
public class Car extends Vehicle{

    String name = "KIA";

    public Car(){
        System.out.println("Child Constructor");
    }

    public Car(int wheel, String colour, String n){
        super(wheel, colour);
        //super()
        this.name = n;
        System.out.println("Child Param Constructor "+this.name);
    }

    public void display() {
        System.out.println("child "+ this.wheel + " " + this.colour + " " +this.name);
    }

    public static void main(String[] args) {

        Car c = new Car(4,"blue","Maruti");
        c.display();
        c.display1();

        Auto a = new Auto(4, "yellow");
        a.display1();

        Vehicle v = new Vehicle(100, "aaaaaa");
        v.display1();

        System.out.println(c.getWheel());
    }
}