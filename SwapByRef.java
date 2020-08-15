package Problems;

import java.util.Scanner;

public class Codevita2 {
	
	
int a ,b;


Codevita2(int a , int b)
{
	this.a = a;
	this.b=b;
}

void swap( Codevita2 stn)
{
	int temp ;
	temp=stn.a;
	stn.a = stn.b;
	stn.b=temp;
	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Codevita2 c = new Codevita2(10,20);
//		c.a=12;
//		c.b=10;
		System.out.println(c.a + " "+ c.b);
		
		c.swap(c);
		
		System.out.println(c.a +" "+c.b);
	}
		
		
	


}
