import java.util.HashSet;

import java.util.*;

public class Iterators{
	
	public static void main(String[]args){
		
		HashSet<String>Iteratorss = new HashSet<String>();
		
		Iteratorss.add("Red");
		
		Iteratorss.add("Green");
		
		Iteratorss.add("black");
		
		Iteratorss.add("yellow");
		
		Iterator Test = Iteratorss.iterator();

	while(Test.hasNext()){
	System.out.println(Test.next());
	}
}	
}

		