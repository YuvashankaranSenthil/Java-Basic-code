public class Dog1 {
    
    private String name;
    private String breed;
    
   
    public Dog1() {}
    
   
    public Dog1(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

   
    public String getName() {
        return name;
    }

    
    public String getBreed() {
        return breed;
    }

   
    public void setName(String name) {
        this.name = name;
    }

   
    public void setBreed(String breed) {
        this.breed = breed;
    }

    public static void main(String[] args) {
      
        Dog1 micky = new Dog1("Micky", "Labrador");
		
        Dog1 max = new Dog1("Max", "pug");

       
        System.out.println(micky.getName() + " is " + micky.getBreed());
		
        System.out.println(max.getName() + " is " + max.getBreed());
    }
}
