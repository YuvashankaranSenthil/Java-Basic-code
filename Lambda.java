import java.util.*;


public class Lambda{
	
	public static void main(String[]args){
		
		Sumcal sumcal = (x,y)->x+y;
		int result = sumcal.sum(7,6);
		System.out.println("(sum 7,6):"+result);
		int results = sumcal.sum(15,-35);
		System.out.println("(sum 15, -35):"+results);
	}
}
