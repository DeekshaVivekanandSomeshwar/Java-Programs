package basicProgram;

import java.util.Scanner;

public class AreaOfCircle {

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		double pi = Math.PI;
		System.out.println("Enter value of radius of circle: ");
		int r = s.nextInt();
		double area = pi*r*r;
		System.out.println("Area of circle: "+area);
		s.close();
	}
}
