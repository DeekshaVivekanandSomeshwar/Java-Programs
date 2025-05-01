package basicProgram;

import java.util.Scanner;

class Voter
{
	static void vote()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter age: ");
		int age = s.nextInt();
		System.out.println("Enter gender(Female/Male): ");
		String gender = s.next();
		//String gender = "Female";
		if(age>=18 && (gender=="Female"))
		{
			System.out.println("User can vote");
		}
		else
		{
			System.out.println("User cannot vote");
		}
		s.close();
	}
}

public class FemaleVoter {
public static void main(String[] args) {
	Voter.vote();
}
		
}

