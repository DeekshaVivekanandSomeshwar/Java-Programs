package basicProgram;

import java.util.Scanner;

public class FinallyKeyword {

	public static void main(String[] args) {
		
		try
		{
			Scanner s= new Scanner(System.in);
			System.out.println("Enter OTP:");
			short otp= s.nextShort();
			System.out.println("OTP: "+otp);
		}
	
		catch(Exception b)
		{
			Scanner s= new Scanner(System.in);
			System.out.println("Enter 4 digit numeric OTP:");
			short otp= s.nextShort();
			System.out.println("OTP: "+otp);
		}
		finally
		{
			System.out.println("Blocked as it is invalid OTP");
		}


	}

}
