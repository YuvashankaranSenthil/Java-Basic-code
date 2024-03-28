import java.util.*;

import java.util.Scanner;

public class A2{

public static void main(String[]args){
	
	Scanner test = new Scanner(System.in);
	
	System.out.println("Enter the number : ");
	
	int num1 = test.nextInt();
	
	System.out.println("Enter the num2 : ");
	
	int num2 = test.nextInt();
	
	if(num1>0){
		
		System.out.println("Enter the number the postive : "+ num1);
	}
	else if (num2<0){
		
		System.out.println("Enter the number the negative: "+num2);
	}
}
}