package Problems;

import java.util.*;
public class NoDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//remove duplicates with extra memory
		
		//nodupli();
		
		//removes duplicates without extra memory
		
	 int a[] =noDuplicate();
		for(int i = 0 ; i< a.length ; i++)System.out.println(a[i]);

	}
	
	static void nodupli()
	{
int num[] = { 0, 0, 1, 1, 1, 2, 2, 2, 3};
		
		Set<Integer> set = new HashSet();
		
		for(int item : num)
			set.add(item);
		
		
		System.out.println(set.size());
			
	}

	
	static int[] noDuplicate()
	{
		
		int num[] = { 0, 0, 1, 1, 1, 2, 2, 2, 3};
		
		int count = 0 , temp = Integer.MAX_VALUE  , previous = Integer.MAX_VALUE;
		
		int j = 0 ;
		
		for(int i =0 ; i < num.length ; i++ )
		{
			if( num [i] != num[j] )
			{	
				j++;
				
				num[j] = num[i] ;
		
			
			}
		
		}
		return num;
		
		//System.out.println(j+1);
		
		
		
	}
}
























