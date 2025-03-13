package basicProgram;
class X 
{

  X(String name, int age) 
  {
	  
		// TODO Auto-generated constructor stub
	  System.out.println(name+"X"+age);

	
	}

	
}

class A extends X
{
	A(String name, int age)
	{
		
		super(name,age);
		
		 System.out.println(name+"A"+age);
	}

	
}
public class SuperClass  extends A{
	
	
	SuperClass(String name, int age) 
	{
		super(name,age);
		System.out.println(name+"S"+age);
		

	}

	public static void main(String[] args) {
	
		new SuperClass("a",4);


	}

}
