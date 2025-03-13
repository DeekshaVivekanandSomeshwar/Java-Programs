package basicProgram;
class RedLight
{
	void Traffic()
	{
		System.out.println("Vehicle should stop");
	}
}
class YellowLight extends RedLight
{
	void Traffic()
	{
		super.Traffic();
		System.out.println("Vehicle should slow down");
	}
}
class GreenLight extends YellowLight
{
	void Traffic()
	{
		super.Traffic();
		System.out.println("Vehicle should go");
	}
}
public class SuperKeyword {

	public static void main(String[] args) {
		GreenLight t = new GreenLight();
		t.Traffic();
	}

}
