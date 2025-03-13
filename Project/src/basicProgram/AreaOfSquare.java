package basicProgram;

import java.util.Scanner;

public class AreaOfSquare {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter value of side of square: ");
		int a = s.nextInt();
		int area = a*a;
		System.out.println("Area of square: "+area);
		s.close();

	}

}
