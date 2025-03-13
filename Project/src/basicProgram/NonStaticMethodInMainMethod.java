package basicProgram;

public class NonStaticMethodInMainMethod {
	void addition()
	{
		int a = 10;
		int b = 20;
		int sum = a+b;
		System.out.println(sum);
		
	}

	public static void main(String[] args) {
		NonStaticMethodInMainMethod n = new NonStaticMethodInMainMethod();
		n.addition();

	}

}
