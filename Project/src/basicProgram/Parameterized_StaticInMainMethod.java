package basicProgram;

public class Parameterized_StaticInMainMethod {
	static void div(double a, double b)
	{
		double div = a/b;
		System.out.println("Division:"+div);
	}
	static void city(String c)
	{
		System.out.println("City: "+c);
	}
	static void intial(char a, char b, char c)
	{
		System.out.println(""+a+""+b+""+c);
	}

	public static void main(String[] args) {
		div(11,600);
		city("Bengaluru");
		intial('M','r','s');
	}
}
