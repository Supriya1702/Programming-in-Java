package sets;

import java.util.*;
public class HashMapPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Map interface extends HashMap , TreeMap ,EnumMap
		
		//new HashMap creates a new memory location and assigns it to map
		
		//So , maps are basically key value pair ds , each key corresponds to a 
		 // single value. 
		
		//All keys are unique
		
		Map <String , Integer> map = new HashMap<String, Integer>();
		
		map.put("Ball", 6);
		map.put("Cat", 7);
		map.put("Dog", 5);
		 
		// Set keySet() returns a set view of all keys of HashMap
		// Collection value() returns all values of the HashMap
		
		System.out.println(map.keySet());
		System.out.println(map.values());
		
		
		//For traversal of HashMap we need to create entry object
		
		for( Map.Entry<String, Integer>  entry : map.entrySet())
		{
			System.out.println(entry.getKey() +" "+ entry.getValue());
		}
		
	}

}
