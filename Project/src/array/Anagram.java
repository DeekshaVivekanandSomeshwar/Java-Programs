package array;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first string: ");
		String a=sc.next();
		System.out.println("Enter first string: ");
		String b=sc.next();
		if(a.length()!=b.length())
		{
			System.out.println("Two string are not anagram");
		}
		else
		{
			char ac[]=a.toCharArray();
			char bc[]=b.toCharArray();
		    Arrays.sort(ac);
			Arrays.sort(bc);
			boolean ana=Arrays.equals(ac, bc);
			if(ana==true)
			{
				System.out.println("Two string are anagram");
			}
			else
			{
				System.out.println("Two string are not anagram");
			}
		}

	}

}