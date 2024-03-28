 class Vehicle {
    int wheel = 10;
    String color = "red";

    public Vehicle(int wheel, String color) {
        this.wheel = wheel;
        this.color = color;
    }

    public void display() {
        System.out.println("Wheel: " + this.wheel + ", Color: " + this.color);
    }
}

public class Carsss extends Vehicle {
    String name = "hyundai";
	

    public static void main(String[] args) {
        Car c = new Car(4, "blue", "hyundai");

        System.out.println("Wheel: " + c.wheel + ", Color: " + c.color + ", Name: " + c.name);

        c.display();
    }
}
