package basicProgram;

public class AndOperator {
public static void main(String[] args) {
	int a = 100;
	int b = 150;
	int c = 165;
	if(a>b && a>c)
	{
		System.out.println("a is greatest");
	}
	else if(b>a && b>c)
	{
		System.out.println("b is greatest");
	}
	else
	{
		System.out.println("c is greatest");
	}
}
}
