package basicProgram;

public class NonStatic_3_InMainMethod {
	void mul()
	{
		int a = 10;
		int b = 20;
		System.out.println(a*b);	
	}
	void mod()
	{
		int a = 10;
		int b = 20;
		System.out.println(a%b);	
	}
	void div()
	{
		int a = 10;
		int b = 20;
		System.out.println(a/b);	
	}

	public static void main(String[] args) {
		NonStatic_3_InMainMethod s = new NonStatic_3_InMainMethod();
		s.mul();
		s.mod();
		s.div();
		
	}

}
