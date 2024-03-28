public class Person{
	
	private String name;
	
	private int age ;
	
	
	public Person(){}
	
	public Person(String name,int age){
	
	this.name = name;
	
	this.age = age;
}

public String getName(){
	return name;
}
public int getAge(){
	return age;
}
public static void main(String[]args){
	
	Person yuva = new Person();
	
    Person vijay = new Person();
	
	System.out.println(yuva.getName()+" is "+ yuva.getAge());
	
	System.out.println(vijay.getName()+" is "+ yuva.getAge());
}
}

	

	