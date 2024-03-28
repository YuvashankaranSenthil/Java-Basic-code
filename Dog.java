public class Dog{
	
	private String name;
	
	private String breed;
	
	public Dog(){}
	
	public Dog(String name,String breed){
	
	this.name = name;
	
	this.breed = breed;
}

public String getName(){
	return name;
}
public String getBreed(){
	return breed;
}
public void setName(String name){
	this.name=name;
}
public void setBreed(String breed){
	this.breed=breed;
}
public static void main(String[]args){

 Dog micky = new Dog("Micky", "Labrador");
 
 Dog max = new Dog("Max", "Golden Retriever");


System.out.println(micky.getName()+"is "+ max.setBreed());

System.out.println(max.getName()+" is "+ micky.setBreed());
}
}

	