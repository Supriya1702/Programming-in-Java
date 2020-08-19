package Problems;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// In Binary Search the elements must either sorted in ascendig or descending form
		int a [] = {1,2,4,5,6,13,26,67};
		int key = 13;
		
		binarysearch(a,key , 0 , a.length-1);
		
		int index =bsint(a,key,0,a.length-1);
		System.out.println("The postion where "+key+" lies is "+index);

	}
	//FOR VOID RETURN
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
	
	
	static int bsint(int a[] , int key , int low , int high)
	{
	
		int mid = (low +high)/2;
		
		if(a[mid] == key)
			return mid+1;
		
		else if( key <a[mid])
			 bsint(a,key,low , mid-1);
		
		else if ( key > a[mid])
			return bsint(a,key,mid+1,high);
		
		//for the sake of returning int value by method
		//Also , return bsint(...) is necessry when recursively calling 
		//or else it returns -1 instead ...the ultimate return of method;
		return -1;
		
	}


}
