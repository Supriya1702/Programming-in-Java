package Problems;

public class Stringposition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "2020-01-08";
		String month = "";
		
		String str[] = s.split("-");
		
		if(str[1].equals("01") )
			month = "January";
		
		System.out.println(str[2] +"-"+ month +"-"+ str[0] );
		
		
		

	}

}
