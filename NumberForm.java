package Problems;

import java.util.*;

public class NumberForm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num =0 , temp=0;
		
		System.out.println("Enter number of digits");
		
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		
		System.out.println("Enter digits from unit place i.e. right to left");
		
		for(int i = 0 ; i < n ;i++)
		{
			temp=in.nextInt();
			
			num =num+ temp*(int)Math.pow(10, i);
		}

		System.out.println(num);
	}

}
