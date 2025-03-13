package basicProgram;

import java.util.Scanner;

class B
{
	void cube()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter value of side of cube: ");
		int a = s.nextInt();
		int area = 6*a*a;
		System.out.println("Area of cube:"+area);
		s.close();
	}
}

public class SingleLevelInheritance extends B {

	public static void main(String[] args) {
		SingleLevelInheritance a = new SingleLevelInheritance();
		a.cube();

	}

}
