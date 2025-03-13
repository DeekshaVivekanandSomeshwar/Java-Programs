package basicProgram;

class Grandparentage
{
	Grandparentage(String name, int age)
	{
	 System.out.println("Name of grandfather is "+name+" and age is "+age);
	}
}
class Parentage extends Grandparentage
{
	Parentage(String name, int age)
	{
		super("Dasharatha", 82);
		System.out.println("Name of Parent is "+name+" and age is "+age);
	}
}
class Childage extends Parentage
{
	Childage(String name, int age)
	{
		super("Ram", 45);
		System.out.println("Name of Child is "+name+" and age is "+age);
	}
}
public class SuperCallingStatementParameterirized {
	public static void main(String[] args) {
		new Childage("Luv",10);
	}

}
