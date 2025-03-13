package basicProgram;

public class StaticNonstaticGlobalVariable {
	static int a= 100;
	static int b= 200;
	int c=200;
	static void mod() 
	{
		System.out.println(a%b);
	}
	void greater()
	{
		if(a>50)
		{
			System.out.println("a is greater");
		}
		else
		{
			System.out.println("a is not greater");
		}
	}

	public static void main(String[] args) {
	 mod();
	 StaticNonstaticGlobalVariable s = new StaticNonstaticGlobalVariable();
	 s.greater();
	}
}
