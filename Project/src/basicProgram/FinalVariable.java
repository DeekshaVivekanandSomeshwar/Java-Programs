package basicProgram;

public class FinalVariable {
	final static double pi = 3.14;
	void week()
	{
		
		final int d=7;
		System.out.println("Number of days in week: "+d);
	}
	static void area()
	{
		int r=5;
		double area = pi * r *r;
		System.out.println("Area: "+area);
	}
	public static void main(String[] args) 
	{
		FinalVariable fv = new FinalVariable();
		fv.week();
		area();
	}

}
