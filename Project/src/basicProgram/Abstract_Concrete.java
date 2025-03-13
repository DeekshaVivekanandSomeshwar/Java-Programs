package basicProgram;

abstract class Arithematic1
{
	abstract void mul();
	void div()
	{
		double a =25;
		double b=10;
		double div = a/b;
		System.out.println("Division: "+div);
	}
}

public class Abstract_Concrete extends Arithematic1 {

	public static void main(String[] args) {
		Abstract_Concrete ac = new Abstract_Concrete();
		ac.div();
		ac.mul();

	}

	@Override
	void mul() {
		int a =25;
		int b=10;
		int mul = a*b;
		System.out.println("Multiplication: "+mul);
		
	}

}
