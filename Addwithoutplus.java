package Problems;

public class Addwithoutplus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 5 , b =3;
		
		while( a!=0)
		{
			a--;
			b++;
		}
		
		System.out.println("Sum is " + b);
		
	}
	
	
	/*  a => 1+ 1 +1+ 1+ 1
	 *  b => 1 + 1+ 1
	 * 
	 * a=> 1 +1+ 1+ 1
	 * b=> 1 +1 +1 +1
	 * 
	 *  when a = 0
	 *  b=> 1+ 1+ 1....a number of times
	 */
	

}
