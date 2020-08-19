package Problems;

public class BubbleSort {

	public static void main(String[] args) {

 
		
		int a[]= {7,384,6,4,56,0,3};
		
	
			   bubblesort(a);
			   printArray(a);

	}
	
	static void bubblesort(int a[])
	{
		int temp=0;
		boolean swapped = false;
		
		for(int i = 0 ; i< a.length - 1 ; i++)
		{
			// 1 false at every pass
			swapped = false;
			 
			for( int j=0 ; j< a.length-1-i ; j++)
		 	   {
			     if(a[j] > a[j+1])
		        	{
				     temp = a[j];
				     a[j]=a[j+1];
				     a[j+1]=temp;
				
				     swapped = true ;
				     //2 if even a single swap occurs swapped variable becomes true
			          }
			
			   }
			//if not even a single swap in the former j loop then array is sorted
			//so break out the for i loop that has n-1 passes
			if(swapped == false)
				break;
		}
		
		
	}
	

	
	static void printArray(int a[])
	{
		for(int val : a)
		System.out.println(val);
	}

}
