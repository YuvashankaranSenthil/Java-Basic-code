import java.util.Scanner;

public class Problem1{
	
	public static void main(String[]args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the Number1: ");
		
		int num1 = input.nextInt();
		
		System.out.println("Enter the Number2: ");
		
		int num2 = input.nextInt();
		
		if(num1>num2)
			
			System.out.println("max1 Number = "+num1);
			
		else if(num1<num2)
			
				System.out.println("max2 Number="+num2);
				
		else
			System.out.println("both are equal "+num1);
	}
}
