package basicProgram;

import java.util.Scanner;

public class CircumferenceofSquare {

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter value of side of square: ");
		int a = s.nextInt();
		int cirmcumf = 4*a;
		System.out.println("Circumference of square: "+cirmcumf);
		s.close();


	}

}
