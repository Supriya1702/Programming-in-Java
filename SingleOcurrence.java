package Problems;
import java.util.*;
import java.util.Map.Entry;

//Necessary to import java.util.Map.Entry;
// java.util.* doesn't work standalone

public class SingleOcurrence {

	public static void main(String[] args) {
		
		int a[]= {1,1,2,3,3,4,4};
		
		int single= Integer.MIN_VALUE;
	
		// HashMap containing element as key and its no. of occurences as value
		
		Map<Integer,Integer> map = new HashMap<Integer, Integer>();
		
		for(int  i : a)
		{
			//Null Pointer Exception if try to increment value when not present
			//SO necessary to add else map.put(i,1) expression when first time element is being found
			
		   if(map.containsKey(i))
	                map.put(i,map.get(i)+1);
		   else
		       map.put(i, 1);
		}
		
		//for iterating over hashmap's each entry
		
		  for( Entry<Integer, Integer> entry : map.entrySet())
		  {
			  if(entry.getValue().equals(1))
				  single=entry.getKey();
			  
		  }
				 
				 System.out.println(single);
		
	}
}
