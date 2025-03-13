package basicProgram;

interface Login1
{
	void username();
}
interface Login2
{
	void email();
}
interface Login3 extends Login2
{
	void mobilenumber();
}
public class Interface_MultipleLevel implements Login1,Login3 {

	public static void main(String[] args) {
		Interface_MultipleLevel iml = new Interface_MultipleLevel();
		iml.username();
		iml.email();
		iml.mobilenumber();
	}

	public void mobilenumber() 
	{
		System.out.println("User is logged in with mobile number");	
	}

	public void email() 
	{
		System.out.println("User is logged in with email");	
	}

	@Override
	public void username() 
	{
		System.out.println("User is logged in with username");
	}

}
