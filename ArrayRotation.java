package Problems;
import java.util.*;
public class ArrayRotation {

	public static void main(String[] args) {
		

		//RIGHT ARRAY ROTATION
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the size of the array");
		int n = in.nextInt() ;
		
		//int arr[] = {1,2,3,4,5};
		int arr[] = new int[n] ; 
		
		for( int i = 0 ; i< arr.length ; i++)
		          arr[i] = in.nextInt() ;
		
		int len = arr.length ;
		
		System.out.println("Enter the no of rotations");
		
		int d = in.nextInt() ; // rotation by the number of elements
		
		int arr2[] = new int[len + d] ; // creation of new array to store shifted locations
		
		for( int i = 0 ; i < len ; i++ )
		{
			
			arr2[i+d] = arr[i] ;
			
		}
		
		int len2 = arr2.length ;
//		arr2[0] = arr2[len2-2] ;
//		arr2[1] = arr2[len2-1] ;
//		
//		arr2[len2-1]=0;
//		arr2[len2-2]=0;
		
		
		int j = 0 ;
		
		while( j < d)
		{
			
			arr2[j] = arr2[ len2 - d + j];
			j++ ;
		}
//		
		for( int i = 0 ; i < arr2.length - d ; i++)
			System.out.println(arr2[i]);
			
		
		
	}

}
