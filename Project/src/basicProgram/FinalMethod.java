package basicProgram;

import java.util.Scanner;

public class FinalMethod {
	final static double pi = Math.PI;
	final void areaofcircle()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the radius of circle: ");
		int r = s.nextInt();
		double area = pi*r*r;
		System.out.println("Area of circle: "+area);
		s.close();
		
	}

	public static void main(String[] args) {
		FinalMethod fm = new FinalMethod();
		fm.areaofcircle();

	}

}
