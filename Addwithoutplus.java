package Problems;

public class Addwithoutplus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Jisme add hora hai wo sum hai
		
		int a = -5 , b =3;
		
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
		}
		
		System.out.println("Sum is " + a);
		
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
	
	
	
	


