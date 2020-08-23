package Problems;

public class PrimeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// A Prime Number is a natural number greater than 1
		// that can written as a product of two numbers smaller than itself (even with repetition)
		// eg 4 can be written as 2 * 2 
		
		// ALSO PRIME NUMBER HAS ONLY TWO DIVISORS 1 and NUMBER itself
		
		
		// Agar saare conditions check krne hai toh " if/else if " nahi blki "if / if" lgana
		
		int num =0 ;
		boolean isPrime = true;
		
		if ( num == 2)
			isPrime = true;
		
		 if (num > 1)
		{
			for( int i =2 ; i < num ; i++)
			{
				if( num % i == 0)
				{
					isPrime = false;
					break;
				}
			}
			
		}
		
		if(isPrime && num >1)
			System.out.println("Prime Number");
		
		if( !isPrime && num > 1) 
			System.out.println("Not a Prime Number");
		
		else 
			System.out.println("Enter a natural number greater than 1");
		
		// calling static prime method
		// System.out.println(prime(num));

	}
	
	// ALso if we just check if from i = 2 to ceil of sqrt of num divides the num then it's not prime
	static boolean prime(int num)
	{
		boolean isPrime = true ;
		
		for( int i =2 ; i < Math.ceil(Math.sqrt(num)) ; i++)
		{	if( num % i == 0)
			 {
				isPrime = false ;
		                 break;
	                  }
		}
	
	
		return isPrime;
	
	}


}
