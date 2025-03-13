package basicProgram;

import java.util.Scanner;

public class CircumferanceOfRectangle {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter length of rectangle: ");
		int l = s.nextInt();
		System.out.println("Enter width of rectangle: ");
		int w = s.nextInt();
		int circumf = 2*(l+w);
		System.out.println("Circumferance of rectangle: "+circumf);
		s.close();

	}

}
