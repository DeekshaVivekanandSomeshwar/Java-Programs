package basicProgram;

public class MethodOverloading {
	void div(int a, int b)
	{
		System.out.println(a/b);	
	}
	void div(double a, int b)
	{
		System.out.println(a/b);	
	}
	static void div(int a, double b)
	{
		System.out.println(a/b);	
	}
	static void div(String a, String b)
	{
		System.out.println(""+a+" "+b);	
	}

	public static void main(String[] args) {
	MethodOverloading d = new MethodOverloading();
	d.div(708,75);
	d.div(777.5,101);
	div(77,1010.1);
	div("Deeksha","Someshwar");
	}
}
