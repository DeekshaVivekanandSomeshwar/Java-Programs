package basicProgram;

public class AccessSpecifierSamePackage {

	public static void methodPackage1()
	{
		System.out.println("public");
	}
	private static void methodPackage2() 
	{
		System.out.println("private");
	}
	static void methodPackage3() 
    {
    	System.out.println("default/package");
    }
    protected static void methodPackage4()
    {
    	System.out.println("protected");
    }

}
