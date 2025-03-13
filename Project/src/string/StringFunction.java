package string;

public class StringFunction {

	public static void main(String[] args) 
	{
	  String input="WorK";
	  String lc=input.toLowerCase();
	  System.out.println("Lower Case: "+lc);
	  String uc=input.toUpperCase();
	  System.out.println("Upper Case: "+uc);
	  System.out.println("Length: "+input.length());
	  System.out.println("3rd Char:"+input.charAt(2));
	  String input1="   Job  ";
	  System.out.println("Trim:"+input1.trim());

	}

}
