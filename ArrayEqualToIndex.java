package Problems;
import java.util.*;
public class ArrayEqualToIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner in = new Scanner(System.in);
		
		 int[] arr = new int[5];
		 
		 for(int i = 0 ; i < arr.length ; i++)
			 arr[i] = in .nextInt();
		 
		 
		 
		 HashSet<Integer> set = new HashSet<Integer>();
		 
		 for(int i = 0 ; i < arr.length ; i++ )
			 set.add(arr[i]);
		 
		 
		 for(int i =0 ; i< arr.length ;i++)
		 {
			 if(set.contains(i))
				 arr[i] = i ;
			 else
				 arr[i] = -1 ;
			 
			 
			
		 }
		 
		 System.out.println(Arrays.toString(arr));
		 
		 
		
		 
		 

	}

}
