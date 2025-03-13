package basicProgram;

class Inheritancebasic
{
	static void mul()
	{
		int a= 8,b=20;
		int mul =a*b;
		System.out.println(mul);
		
	}
}
public class Parent extends Inheritancebasic
{
	public static void main(String[] args) 
	{
		mul();
	}
	

}
