package Problems;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum = 0;
		int arr[] = {1,2,3,4,5,6,7,8,0,10};
		int n = arr.length;
		int expSum= n*(n+1)/2;
		
		for(int i=0; i< arr.length  ; i++)
			      sum= sum + arr[i];
		
		
		int missNum = Math.abs(expSum - sum) ;
		
		System.out.println(missNum);
		
		
		
			
	}

}
