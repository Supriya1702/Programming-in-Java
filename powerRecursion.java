package sets;
import java.util.Scanner;
public class powerRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
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
