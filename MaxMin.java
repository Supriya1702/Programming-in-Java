package Problems;

public class MaxMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int arr[] = { 1 ,2 ,3,5,6};
		
		
		int max = Integer.MIN_VALUE , min =Integer.MAX_VALUE ;
		
		for(int i = 0 ; i < arr.length ; i++)
		{
			if(arr[i] > max)
				 max = arr[i];
			if(arr[i] < min)
				min = arr[i];
		}

		System.out.println("Max : "+max +"\t"+"Min : "+min);
	}

}
