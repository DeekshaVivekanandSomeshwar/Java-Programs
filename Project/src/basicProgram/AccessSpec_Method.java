package basicProgram;

public class AccessSpec_Method {
	public void method1()
	{
		System.out.println("public");
	}
	private void method2() 
	{
		System.out.println("private");
	}
    void method3() 
    {
    	System.out.println("default/package");
    }
    protected void method4()
    {
    	System.out.println("protected");
    }
	public static void main(String[] args) {
	
		AccessSpec_Method a = new AccessSpec_Method();
		a.method1();
		a.method2();
		a.method3();
		a.method4();

		
	}

}
