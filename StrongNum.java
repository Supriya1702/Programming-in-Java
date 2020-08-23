package Problems;

//VERY CLEAN CODE
import java.util.*;
public class StrongNum {

	public static void main(String[] args) {

	 // Strong Nummber is a number that is equal to the sum of the factorial of its digits
		
     Scanner in = new Scanner(System.in);
     
     int num = in.nextInt();
	 
	 // for calculating the number of digits 

    int  numDigits= String.valueOf(num).length();
    
     int temp = num  , sum = 0 , digit = Integer.MIN_VALUE  , fact = Integer.MIN_VALUE;
     
     while(temp!=0)
    {
    	 digit = temp % 10 ;
    	 
    	 fact = factorial(digit);
    	 
    	 sum = sum + fact ;
    	 
    	 temp  = temp /10;
      }
     
     
     if ( sum == num)
    	 System.out.println("Strong Number");
     else
    	 System.out.println("Not a Strong Number");
     

	}
	
	// Recursive Factoial method to rerun factorial of each digit

	static int factorial(int digit)
	{
		if( digit == 0)
			return 1;
		else
			return digit * factorial( digit -1);
	}

}
