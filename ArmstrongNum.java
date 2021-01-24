package Problems;

import java.util.*;
public class ArmstrongNum {

	public static void main(String[] args) {
		
		// An Armstrong Number of order n ( n digits)
		//is a number that is equal to the sum of its digits to the power n
		// eg 371 = 3^3 + 7^3 + 1^3

		System.out.println("Enter the number");
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		
		int arm=0,digit=0;
		int temp = n , count = 0;
		
		int temp1 = n;
		
		int NumDigit=  String.valueOf(n).length();
		

		
		
		while( !(temp ==0))
		{
			digit = temp %10;
			arm = arm +(int) Math.pow(digit,NumDigit);
			temp=temp/10;
		}
		
		if( arm == n)
			System.out.println("Armstrong Number");
		else
			System.out.println("Not an Armstrong Number");
		
	}
//end
}
