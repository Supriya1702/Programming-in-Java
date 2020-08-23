package Problems;

public class Addwithoutplus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Jisme add hora hai wo sum hai
		
		int a = 5 , b =3;
		
		if(a>0)
		{
		while( a!=0)
		{
			a--;
			b++;
		}
		System.out.println("Sume is" +b);
		}
		
		else if ( a< 0)
		{
			while(b!=0)
			{
				a++;
				b--;
			}
			System.out.println("Sum is " + a);
		}
		
		
		// values change kro as a and b increment and decrement hore hai
		int c =10 , d=-7;
		System.out.printf(" Sum using XOR - HALF ADDER LOGIC %d", addxor(c, d ));
		
		//upar C ka printf use kia hai
		
		 
		}
	
	  static int addxor( int  a , int b)
	  { int sum = Integer.MIN_VALUE, carry = Integer.MIN_VALUE;
		  
		  while(b!=0)
		  {
			  sum = a ^ b ;
			  carry = a&b;
			  carry =carry<<1;
			  
			  a=sum;
			  b= carry;
			  
		  }
		  
		  return sum;
		  
	  }
	   
	
	}
	
	 // For postive
	/*  a => 1+ 1 +1+ 1+ 1
	 *  b => 1 + 1+ 1
	 * 
	 * a=> 1 +1+ 1+ 1
	 * b=> 1 +1 +1 +1
	 * 
	 *  when a = 0
	 *  b=> 1+ 1+ 1....a number of times
	 *  
	 *  for negative a 
	 *  a++ and b--
	 */
	
	
	
	


