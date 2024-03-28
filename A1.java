import java.util.*;

import java.util.Scanner;


public class A1{

public static void main(String[]args){
	
	Scanner input = new Scanner (System.in);
	
	System.out.println("Enter the number1: " );
	
	int num1 = input.nextInt();
	
	System.out.println("Enter the number2: " );
	
	int num2 = input.nextInt();			
	
	if (num1>num2){
		
		System.out.println("The Max number as:" + num1);
		
	}
	else if(num1<num2)
	{
		System.out.println("Enter max number as:"+num2);
	}
}
}
