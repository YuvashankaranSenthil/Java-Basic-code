abstract class Animal {

    public String name;
    abstract void sound();

    public void display(){
        System.out.println("display");
    }
}


class Dog extends Animal{

    public Dog(String name){
        this.name = name;
    }
    @Override
    void sound() {
        System.out.println("bark");
    }

    public void display(){
        System.out.println("display dog");
    }
}

class Cat extends Animal{

    public Cat(String name){
        this.name = name;
    }

    @Override
    void sound() {
        System.out.println("meow");
    }
}

class Petshop{

     public static void cure(Animal a){
         System.out.println("animal name is "+a.name);
     }
}


public class AbstractClass1{

    public static void main(String[] args) {

        //upcasting
        Animal a = new Dog("Dog");
        a.sound();
        a.display();

        Petshop.cure(a);

        a = new Cat("cat");
        a.sound();
        Petshop.cure(a);
        ///Animal b = new Cat("Cat");
        //b.sound();
    }
}