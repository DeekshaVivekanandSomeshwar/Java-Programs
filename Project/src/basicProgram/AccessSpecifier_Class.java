package basicProgram;

import java.util.Scanner;

class AccessSpecifier_Class {
	static void add()
	{
		Scanner s1= new Scanner(System.in);
		System.out.println("Enter the first value: ");
		int a=s1.nextInt();
		System.out.println("Enter the second value: ");
		int b=s1.nextInt();
		int sum = a+b;
		System.out.println("Sum: "+sum);
		s1.close();
	}

}
