package basicProgram;

import java.util.Scanner;

public class HIL3 extends HIL2 {
	void signin()
	{
		Scanner s3= new Scanner(System.in);
		System.out.print("Enter username: ");
		String username = s3.next();
		System.out.print("Enter pass: ");
		String pass = s3.next();
		System.out.println("User is Logged in");
		
	}

}
