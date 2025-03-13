package basicProgram;

public class UpdateStaticNonSttaicGlobalVariable {
	int a = 10;
	static int b= 20;
	void nonstaticupdate()
	{
		a=50;
		System.out.println("Updated Nonstatic global variable: "+a);
	}
	static void staticupdate()
	{
		b=100;
		System.out.println("Updated Static global variable: "+b);
	}

	public static void main(String[] args) 
	{
		UpdateStaticNonSttaicGlobalVariable u = new UpdateStaticNonSttaicGlobalVariable();
		u.nonstaticupdate();
		staticupdate();

	}

}
