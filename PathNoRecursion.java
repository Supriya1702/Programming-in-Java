package sets;

public class PathNoRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(path(1,1));

	}

	
	static int path(int m , int n)
	{
		if(m ==1 || n ==1)
			return 1;
		
		else
			return path(m , n-1) + path(m-1,n);
		
	}
	
}
