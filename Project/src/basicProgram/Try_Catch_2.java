package basicProgram;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Try_Catch_2 {
	public static void main(String[] args) {
		   Scanner s=new Scanner(System.in);
		   try {
	            System.out.print("Enter an integer: ");
	            int num = s.nextInt(); 

	            int result = 10 / num;
	            System.out.println("Result: " + result);
	            
	        } catch (InputMismatchException e) {
	            System.out.println("Error: Please enter a valid integer.");
	        } catch (ArithmeticException e) {
	            System.out.println("Error: Division by zero is not allowed.");
	        }
	}

}
