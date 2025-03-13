package basicProgram;

public class GlobalVariable {
	int a=100;
	int b;
	void add() 
	{
		int addition = a+b;
		System.out.println(addition);
		
	}

	public static void main(String[] args) {
		GlobalVariable gv = new GlobalVariable();
		gv.add();

	}

}
