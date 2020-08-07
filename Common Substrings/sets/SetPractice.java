package sets;
import java.util.*;
public class SetPractice {

	public static void main(String[] args) {
	   
		//Sets take less time complexity but more space (memory)
		
		//HashSet -> inserts randomly as per hash function , reduced degree of time complexity
		//LinkedSet -> maintains insertion order of the elements, more time 
		//TreeSet -> Sorts the elements , nlogn
		
		Set<String> set = new TreeSet();
		
		set.add("Banana");
		set.add("Apple");
		set.add("Mango");
		
		System.out.println(set);

	}

}
