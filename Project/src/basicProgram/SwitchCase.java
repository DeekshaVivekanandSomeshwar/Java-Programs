package basicProgram;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter first value: ");
		int a=s.nextInt();
		System.out.println("Enter second value: ");
		int b=s.nextInt();
		System.out.println("Enter operation number: ");
		int operator=s.nextInt();
		switch(operator)
		{
		case 1:int sum =a+b;
		System.out.println(sum);
		       break;
		case 2:int sub =a-b;
		System.out.println(sub);
	           break;
		case 3:int mul =a*b;
		System.out.println(mul);
	           break;
		case 4:double div =a/b;
		System.out.println(div);
	           break;
	     default: System.out.println("Operation is not availabe");
		
		
		}
		

	}

}
