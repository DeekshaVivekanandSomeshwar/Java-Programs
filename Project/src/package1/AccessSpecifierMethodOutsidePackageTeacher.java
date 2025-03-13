package package1;

public class AccessSpecifierMethodOutsidePackageTeacher {
	public void methodPackage1()
	{
		System.out.println("public");
	}
    protected void methodPackage2()
    {
    	System.out.println("protected");
    }
    void methodPackage3() 
    {
    	System.out.println("default/package");
    }
	private void methodPackage4() 
	{
		System.out.println("private");
	}
   

}
