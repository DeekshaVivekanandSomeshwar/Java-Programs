package basicProgram;
import java.util.Scanner;

class First
{

	final static double pi = Math.PI;
	static void areacylinder()
	{
		Scanner s= new Scanner(System.in);
		System.out.println("Enter value radius of base of Cylinder: ");
		int r = s.nextInt();
		System.out.println("Enter value height of Cylinder: ");
		int h = s.nextInt();
		double area = 2 * pi*r*h;
		System.out.println("Area of Cylinder: "+area);
	
	}
}
class Second extends First
{
	 void VolumeOfCylinder()
	{
	
		 
		Scanner s1= new Scanner(System.in);
		System.out.println("Enter value radius of base of Cylinder: ");
		int r = s1.nextInt();
		System.out.println("Enter value height of Cylinder: ");
		int h = s1.nextInt();
		double volume = pi*r*r*h;
		System.out.println("Volume of Cylinder: "+volume);
		s1.close();	
	}

}

public class MultiLevelInheritance extends Second{
	public static void main(String[] args) 
	{
		areacylinder();
		MultiLevelInheritance ml = new MultiLevelInheritance();
		ml.VolumeOfCylinder();
	}
}
