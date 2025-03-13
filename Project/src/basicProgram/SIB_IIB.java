package basicProgram;

public class SIB_IIB {
	static int a=10;
	static int b=15;
	static
	{
		int sum =a+b;
		System.out.println("SIB Addition: "+sum);
	}
	{
		int mul =a*b;
		System.out.println("IIB Multiplication: "+mul);
	}

	public static void main(String[] args) {
	 int sub=b-a;
	 System.out.println("Main Subtraction: "+sub);
	 new SIB_IIB();

	}

}
