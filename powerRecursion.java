package sets;
import java.util.Scanner;
public class powerRecursion {

	public static void main(String[] args) {
		// Recursion
		//1. Base case
	        //2. Smaller problems
		//3.generalize formula
		// Also DP is same , use bottom up approach which means move towards the base condition and then start returning from base
		
		Scanner in = new Scanner(System.in);
		int a = in .nextInt();
		int b = in.nextInt();
		
		
		System.out.println(power(a,b));

	}
	
	
	static int power(int a ,int b)
	{
		if(b==0)
			return 1;
		else
			return a*power(a,b-1);
	}

}
