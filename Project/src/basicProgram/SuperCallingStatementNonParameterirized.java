package basicProgram;

class Grandparent 
{
	Grandparent()
	{
		System.out.println("Logged in with Grandparent Username");
	}
	
}
class Parent1 extends Grandparent
{
	Parent1()
	{
		System.out.println("Logged in with Parent Username");
	}
	
}

class Child extends Parent1
{
	Child()
	{
		super();
		System.out.println("Logged in with Child Username");
	}
}

public class SuperCallingStatementNonParameterirized {

	public static void main(String[] args) {
		new Child();

	}

}
