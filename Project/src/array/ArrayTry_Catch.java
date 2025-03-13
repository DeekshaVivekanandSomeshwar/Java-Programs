package array;

public class ArrayTry_Catch {

	public static void main(String[] args) {
		try {
		int rollno[]= new int[3];
		rollno[0]=10;
		rollno[1]=20;
		rollno[2]=30;
		rollno[3]=40;
		System.out.println("Roll No 1: "+rollno[0]);
		System.out.println("Roll No 2: "+rollno[1]);
		System.out.println("Roll No 3: "+rollno[2]);
		System.out.println("Roll No 4: "+rollno[3]);
		}
		catch(ArrayIndexOutOfBoundsException a)
		{
			int rollno[]= new int[3];
			rollno[0]=10;
			rollno[1]=20;
			rollno[2]=30;
		
			System.out.println("Roll No 1: "+rollno[0]);
			System.out.println("Roll No 2: "+rollno[1]);
			System.out.println("Roll No 3: "+rollno[2]);
			
			
		}

	}

}
