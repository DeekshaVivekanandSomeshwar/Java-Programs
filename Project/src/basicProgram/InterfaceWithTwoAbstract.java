package basicProgram;
interface Amazon
{
	abstract void username();
	abstract void password();
}

public class InterfaceWithTwoAbstract implements Amazon {
	

	public static void main(String[] args) {
		
		InterfaceWithTwoAbstract ia = new InterfaceWithTwoAbstract();
		ia.username();
		ia.password();
		
	}

	@Override
	public void username() {
		System.out.println("Username");
		
	}

	@Override
	public void password() {
		System.out.println("Password");
		
	}

}
