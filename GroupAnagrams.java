package sets;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class GroupAnagrams {

	public static void main(String[] args) {
		int n=6;
		Scanner in = new Scanner(System.in);
		
		String[] strs = new String[n];
		
		for(int i =0 ;i<n ; i++ )
			strs[i]=in.next();
	
		//assigning or referencing returned linkedlist from groupanagram method to list  in main method
		
	 List<List<String>> list=	groupanagram(strs);
	
	 
	 System.out.println(list);

	}
	
	public static List< List<String>> groupanagram(String[] strs)
	{
		//first we'll sort the string 
		//then the sorted string will act as a key for all those strings
		// that have those characters
		
		
		//creating a HashMap of String key and List<String> values as we need
		//  to return List< List<String>>
		
		Map<String , List<String>> map = new HashMap();
		
		//traversing each element in strs array of strings
		
		for(String s :strs)
		{
			
			//sort the string by converting s into chararray
			
			char charArray[] = s.toCharArray();
			//sorting
			Arrays.sort(charArray);
			
			//converting the charArray into String
			String sorted = new String(charArray);
			
			//sorted is now our key
			
			
			//checking if there is no 'sorted' key present in map then add it as key
			// and for value just generate a new linkedlist or any other list
			//as we don't need to assign value in this 'if' condition
			
			if(!map.containsKey(sorted))
			{
				map.put(sorted, new LinkedList<String>());
			}
			
			//adding value corresponding to 'sorted' key to the list of strings
			
			map.get(sorted).add(s);
			
		
			
		}
		
		
		//returning the list of list of string
		
		return new LinkedList< List<String>>(map.values());
		
		
		
		
		
	}

}
