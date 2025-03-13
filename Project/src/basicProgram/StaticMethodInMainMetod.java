package basicProgram;

public class StaticMethodInMainMetod {

	static void add()
	{
		   int a=30;
           int b=20;
           int sum=a+b;
           System.out.println(sum);
	}
	static void mul()
	{
		   int c=30;
           int d=10;
           int mul=c*d;
           System.out.println(mul);
	}
	public static void main(String[] args) 
	{
		add();
		mul();

	}
}
