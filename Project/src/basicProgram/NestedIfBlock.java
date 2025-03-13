package basicProgram;

public class NestedIfBlock {

	public static void main(String[] args) {
		int a = 20;
		int b = 20;
		
		if(a<=b)
		{
			if(a<b)
			{
				System.out.println("b is greater");
			}
			else
			{
				System.out.println("a is equal to b");
			}
		}
		else
		{
				System.out.println("a is greater");
	
		}
	}
}
