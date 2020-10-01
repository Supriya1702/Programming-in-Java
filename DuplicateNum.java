package Problems;
import java.util.*;

public class DuplicateNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//finding the duplicate num in O^2
		
		
		int a[] = {1,2,3,3,4,5} ;
		int duplicateNum = Integer.MAX_VALUE ;
		
		for(int i = 0 ; i< a.length ; i++)
		{
			for(int j = 0 ; j < a.length ; j++)
			{
				if(i==j)
					continue;
				
				if(a[i] == a[j])
					duplicateNum = a[i];
				    
			}
		}
		System.out.println("The duplicate Number is " + duplicateNum);
		
		
		
		
		//In O(n) using HashSet but O(n) of space complexity
		
		int b[] = { 2,3,5,6,7,8,9,9,10};
		int bDuplicate= Integer.MAX_VALUE;
		
		HashSet<Integer>set = new HashSet();
		
		for(int i = 0 ; i < b.length ; i++)
		{
			if(!set.add(b[i]))
				bDuplicate=b[i];
				
				
		}
		
		System.out.println("The duplcate elemnt in b array is"+ bDuplicate);
	}

}
