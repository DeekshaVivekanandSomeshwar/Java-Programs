package string;

import java.util.Scanner;

public class ReverseTheString {

	public static void main(String[] args) {
		String input = "grotechminds";
		String reverse= "";
		for(int i = input.length()-1;i>=0;i--)
		{
			char c1 =input.charAt(i);
			reverse=reverse+c1;
		}
			
		System.out.println("Reverse of "+input+": "+reverse);
		Scanner s = new Scanner(System.in);
		System.out.println("Enter value of input 2: ");
		String input2=s.next();
		String reverse2 = "";
		
		for(int j= input2.length()-1;j>=0;j--)
		{
			char c2=input2.charAt(j);
			reverse2= reverse2+c2;
		}
		System.out.println("Reverse of "+input2+": "+reverse2);
		s.close();

	}

}
