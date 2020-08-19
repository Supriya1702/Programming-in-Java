package Problems;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// In Binary Search the elements must either sorted in ascendig or descending form
		int a [] = {1,2,4,5,6,13,26,67};
		int key = 13;
		
		binarysearch(a,key , 0 , a.length-1);
//		System.out.println("THe postion where "+key+" lies is "+index);

	}
	
	static void binarysearch(int a[],int key ,int low ,int high)
	{
		
	  int mid = (low + high)/2;
	  
	 
	  if(key < a[mid])
		binarysearch(a,key,low,mid-1);
	  
	  else if(key > a[mid])
		 binarysearch(a,key,mid+1,high);

     if(a[mid]==key)
	  System.out.println(mid+1);
	
		
	}

}
