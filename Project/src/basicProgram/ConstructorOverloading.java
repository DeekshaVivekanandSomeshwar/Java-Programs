package basicProgram;

public class ConstructorOverloading {

	ConstructorOverloading(int a)
	{
		System.out.println(a);
	}
    ConstructorOverloading(int a, char b)
	{
		System.out.println("a:"+a+" char: "+b);
	}
	ConstructorOverloading(int a, double b)
	{
		System.out.println(a+","+b);
	}
	public static void main(String[] args) {
		new ConstructorOverloading(10);
		new ConstructorOverloading(50,'D');
		new ConstructorOverloading(5,2.2);
	}

}
