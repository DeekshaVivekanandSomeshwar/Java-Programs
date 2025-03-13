package package2;

import java.util.Scanner;

 public class AccessSpecifierClass_Package2 {
	public void mul()
	{
	Scanner s1= new Scanner(System.in);
	System.out.println("Enter the first value: ");
	int a=s1.nextInt();
	System.out.println("Enter the second value: ");
	int b=s1.nextInt();
	int multiply = a*b;
	System.out.println("Multiplication: "+multiply);
	s1.close();
	}

}
