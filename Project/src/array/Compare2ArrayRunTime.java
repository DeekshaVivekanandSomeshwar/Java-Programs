package array;

import java.util.Arrays;
import java.util.Scanner;

public class Compare2ArrayRunTime {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter size of Array: ");
		int size = s.nextInt();
		int num1[]=new int[size];
		int num2[]=new int[size];
		
		for(int i =0,j=0;i<num1.length;i++,j++)
		{
			System.out.println("Enter first number with index "+i);
			num1[i]=s.nextInt();
			System.out.println("Enter second number with index "+j);
			num2[j]=s.nextInt();
		}
		System.out.println("Array of num1: "+Arrays.toString(num1));
		System.out.println("Array of num2: "+Arrays.toString(num2));
		boolean b1=Arrays.equals(num1, num2);
		if(b1==true)
		{
	      System.out.println("Both Arrays are same");
		}
		else
		{
		      System.out.println("Both Arrays are not same");
		}
		s.close();
	}

}
