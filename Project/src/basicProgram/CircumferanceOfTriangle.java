package basicProgram;

import java.util.Scanner;

public class CircumferanceOfTriangle {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter value of a: ");
		int a = s.nextInt();
		System.out.println("Enter value of b: ");
		int b = s.nextInt();
		System.out.println("Enter value to c: ");
		int c = s.nextInt();
		int circumf = a+b+c;
		System.out.println("Circumference of triangle: "+circumf);
		s.close();

	}

}
