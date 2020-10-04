package Problems;

public class SumPair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = { 1,2,3,5,6,7,10};
		
		int n = 7;
		sum(arr,n);

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

}
