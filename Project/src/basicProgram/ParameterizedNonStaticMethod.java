package basicProgram;

public class ParameterizedNonStaticMethod {
	
	void add(int a, int b)
	{
		int sum = a+b;
		System.out.println("Addition:"+sum);
	}
	void checkboolean(boolean a, int b)
	{
		if(b==100)
		{
			System.out.println(a);
		}
	}
	void gender(String a, char b)
	{

		System.out.println(a+":"+b);
	}

	public static void main(String[] args) {
		ParameterizedNonStaticMethod n = new ParameterizedNonStaticMethod();
		n.add(50,90);
		n.checkboolean(true,100);
		n.gender("Gender",'F');	
	}
}
