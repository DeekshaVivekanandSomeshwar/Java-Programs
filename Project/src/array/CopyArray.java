package array;

import java.util.Arrays;

public class CopyArray {

	public static void main(String[] args) {
		int age1[]=new int[4];
		age1[0]=45;
		age1[1]=71;
		age1[2]=78;
		age1[3]=91;
	
		int age2[]=new int[4];
		for(int i=0;i<=age1.length-1;i++)
		{
			age2[i]=age1[i];
		}
		
		System.out.println("Array: "+Arrays.toString(age1));
		System.out.println("Copied Array: "+Arrays.toString(age2));
	}

}
