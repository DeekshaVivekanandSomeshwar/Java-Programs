package basicProgram;

public class Not_OROperator {

	public static void main(String[] args) {
		int a = 50;
	
		if(!(a==50 || a==78))
		{
			System.out.println("If block will execute");
		}
		else
		{
			System.out.println("Else block will execute");
		}

	}

}
