package array;

public class Count_AlphabetNumberSpaceSpecialChar {

	public static void main(String[] args) {
		String s1="batch no 51 **  ";
		char c1[]=s1.toCharArray();
		int count_alphabet=0;
		int count_number=0;
		int count_space=0;
		int count_specialchar=0;
		//int count_specialchar=0;
		for (int i=0;i<=c1.length-1;i++) 
		{
			boolean b1= Character.isAlphabetic(c1[i]);
			boolean b2= Character.isDigit(c1[i]);
			boolean b3= Character.isSpaceChar(c1[i]);
			if(b1==true)
			{
				count_alphabet++;
			}
			if(b2==true)
			{
				count_number++;
			}
			if(b3==true)
			{
				count_space++;
			}
		
		}
		count_specialchar=c1.length-count_alphabet-count_number-count_space;
		
		System.out.println("Count of Alphabet: "+count_alphabet);
		System.out.println("Count of Number: "+count_number);
		System.out.println("Count of Space: "+count_space);
		System.out.println("Count of Special Character: "+count_specialchar);

	}

}
