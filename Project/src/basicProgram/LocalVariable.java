package basicProgram;

public class LocalVariable {
	
	void multiply()
	{
		int a=10 ;
		int b=20;
		int mul=a*b;
		System.out.println("Multiplication: "+mul);
		
	}
	static void division()
	{
		double a;
		a= 10;
		double b;
		b =20;
		double div=a/b;
		System.out.println("Divison: "+div);	
	}
	static void notequal(int a)
	{
		
		if(a!=10)
		{
		System.out.println("NotEqual");
		}
	}
	public static void main(String[] args) 
	{
		
		LocalVariable lv = new LocalVariable();
		lv.multiply();
		division();
		notequal(20);
	}
}
