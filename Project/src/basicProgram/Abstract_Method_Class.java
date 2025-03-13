package basicProgram;

abstract class Arithematic
{
	abstract void add();
	abstract void sub();
}
public class Abstract_Method_Class extends Arithematic{

	public static void main(String[] args) {
		Abstract_Method_Class a= new Abstract_Method_Class();
		a.add();
		a.sub();
		

	}

	@Override
	void add() {
	int a =5;
	int b=10;
	int sum = a+b;
	System.out.println("Addition:"+sum);
	}

	@Override
	void sub() {
		int a =15;
		int b=10;
		int sub = a-b;
		System.out.println("Subtraction:"+sub);
		
	}

}
