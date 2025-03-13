package basicProgram;

public class Static_NonStaticInMainMethod {
	static void add()
	{
		   int a=30;
           int b=20;
           System.out.println(a+b);
	}
	void sub()
	{
		int a = 10;
		int b = 20;
		System.out.println(b-a);	
	}

	public static void main(String[] args) {
		add();
		Static_NonStaticInMainMethod n = new Static_NonStaticInMainMethod();
		n.sub();
	}

}
