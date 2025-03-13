package basicProgram;

class Android
{
	void Mobile()
	{
		System.out.println("The latest OS of Android is OS 15");
	}
}
class Ios extends Android
{
	void Mobile()
	{
		System.out.println("The latest OS of iOS is OS 18");
	}
	
}

public class MethodOverriding {

	public static void main(String[] args) {
		Ios i = new Ios();
		i.Mobile();
		

	}

}
