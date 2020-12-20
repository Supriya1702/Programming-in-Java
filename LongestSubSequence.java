package Problems;

public class LongestSubSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {1,34,4,5,5,5,5,6,77,77,100};

		//Code to find longest seqence of same integers
		//by checking the current one with previous and increasing the counter if they're
		//equal and if not then just comparing if count is greater than max and if it is then max takes count value
		//also if current is not equal to previous then we assign 1 to count again to start for next iteration
		
		int current=0,previous=0,max=0,count=0;
		
		
		for(int i = 0 ; i<arr.length;i++)
		{
			if(i==0)
			{
				count = 1;
				max=1;
				continue;
			}
			
			current = arr[i] ;
			previous = arr[i-1];
			
				
			
			if(current == previous)
			{	      
				count++;
			
			   
			}
			
			if(current != previous)
			{
				if(max<count)
					max = count ;
				count = 1;
			}
	                 
	
	}
		System.out.println(max);
}
	
}