package basicProgram;

import java.util.Scanner;

public class CircumferenceOfCircle {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double pi = Math.PI;
		System.out.println("Enter value of radius of circle: ");
		int r = s.nextInt();
		double circumf = 2*pi*r;
		System.out.println("Area of circle: "+circumf);
		s.close();

	}

}
