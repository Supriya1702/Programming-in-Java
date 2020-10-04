package Problems;
import java.util.*;
public class SumPair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = { 1,2,3,5,6,7,10};
		
		int n = 7;
		// This method finds the pair of integers having the sum n in O(n2)
		sum(arr,n);
		//this method reuires O(n) of space and O(n) of time complexity
		sumInN(arr,n);

	}
	
	
	
	static void sum(int [] arr,int n)
	{
		for( int i = 0 ; i < arr.length ;i++)
		{
			for( int j = 0 ; j < arr.length ; j++)
				{if(arr[i] + arr[j] == n)
					System.out.println(arr[i]+"\t"+arr[j]);
				}
		}
	}
	
	
	static void sumInN(int[] arr , int n)
	{
		int num=0;
		HashSet<Integer> set = new HashSet(Arrays.asList(arr));
		
		for(int i = 0 ; i < arr.length ; i++)
		{
			set.add(arr[i]);
			
		}

		for(int i = 0 ; i < arr.length ; i++)
		{
			
			num =n- arr[i];
		    if(set.contains(num))
		    	System.out.println(arr[i]+"\t"+num);
		}
	}

}
