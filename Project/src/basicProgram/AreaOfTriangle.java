package basicProgram;

import java.util.Scanner;

public class AreaOfTriangle {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter base of triangle: ");
		int b = s.nextInt();
		System.out.println("Enter height of triangle: ");
		int h = s.nextInt();
		double area = 0.5*b*h;
		System.out.println("Area of triangle: "+area);
		s.close();

	}

}
