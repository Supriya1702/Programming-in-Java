package Problems;

public class MissingNumber {

	public static void main(String[] args) {


		int sum = 0;
		int arr[] = {1,2,3,4,5,6,7,8,0,10};
		int n = arr.length;
		int expSum= n*(n+1)/2;
		
		for(int i=0; i< arr.length  ; i++)
			      sum= sum + arr[i];
		
		
		int missNum = Math.abs(expSum - sum) ;
		
		System.out.println(missNum);
		
		
		
		// code to find a single missing number within a range 1,10 (here)
		//by subtracting the expected sum of  all consecutive numbers using n(n+1)/2
		//with the actual sum of the array elements
			
			
	}

}
