package array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayToString_Sort {

	public static void main(String[] args) 
	{
		int num[]=new int[4];
		num[0]=45;
		num[1]=10;
		num[2]=90;
		num[3]=12;
		
		System.out.println("Array: "+Arrays.toString(num));
		Arrays.sort(num);
		System.out.println("Sorted Array: "+Arrays.toString(num));
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of Array : ");
		int size=s.nextInt();
		String name[]=new String[size];
		for(int i=0;i<=size-1;i++)
		{
			System.out.println("Enter the name of index "+i+":");
			name[i]=s.next();
		}
		
		System.out.println("Array: "+Arrays.toString(name));
		Arrays.sort(name);
		System.out.println("Array: "+Arrays.toString(name));
	}

}
