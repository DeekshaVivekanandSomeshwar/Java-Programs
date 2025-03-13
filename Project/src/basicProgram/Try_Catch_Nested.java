package basicProgram;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Try_Catch_Nested {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		try
		{
		
		try
		{
			System.out.println("Enter first value: ");
			int a1= s.nextInt();
			System.out.println("Enter second value: ");
			int b1= s.nextInt();
			int c1=a1/b1;
			System.out.println("Result: " + c1);
		}
		catch(InputMismatchException ll)
		{
			s.next();
			System.out.println("Enter first numeric value: ");
			int a2= s.nextInt();
			System.out.println("Enter second numeric value: ");
			int b2= s.nextInt();
			int c2=a2/b2;
			System.out.println("Result: " + c2);
		}
		}
		catch(ArithmeticException  a)
		{
			System.out.println("Enter first numeric value ");
			int a3 = s.nextInt();
			System.out.println("Enter numeric value other than 0: ");
			int b3= s.nextInt();
			int c3=a3/b3;
			System.out.println("Result: " + c3);
		}
		
		s.close();
		
	
	}
}
