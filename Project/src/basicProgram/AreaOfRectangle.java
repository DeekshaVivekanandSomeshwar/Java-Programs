package basicProgram;

import java.util.Scanner;

public class AreaOfRectangle {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter length of rectangle: ");
		int l = s.nextInt();
		System.out.println("Enter width of rectangle: ");
		int w = s.nextInt();
		int area = l*w;
		System.out.println("Area of rectangle: "+area);
		s.close();

	}

}
