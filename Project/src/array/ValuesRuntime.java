package array;

import java.util.Scanner;

public class ValuesRuntime {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size: ");
		int size=s.nextInt();
		String name[]=new String[size];
		for(int i=0;i<=size-1;i++)
		{
			System.out.println("Enter the value in index "+i+":");
			name[i]=s.next();
		}
		
		s.close();
	}

}
