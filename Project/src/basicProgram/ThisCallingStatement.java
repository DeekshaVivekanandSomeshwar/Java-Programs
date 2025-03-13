package basicProgram;

class Login12
{
	Login12()
	{
		this("Mobile");
		System.out.println("Login using Web application");
	}
	Login12(String a)
	{
		
		System.out.println("Login using " +a+" application");
	}
}
public class ThisCallingStatement {

	public static void main(String[] args) {
	 new Login12();

	}

}
