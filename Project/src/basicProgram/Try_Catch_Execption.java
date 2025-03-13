package basicProgram;

public class Try_Catch_Execption {

	public static void main(String[] args) {
		int a=1;
		int b=0;
		
		try
		{
			int c=a/b;
			System.out.println(c);
		}
		catch(ArithmeticException a1)
		{
			System.out.println("Handled Exception");
		}
	}

}
