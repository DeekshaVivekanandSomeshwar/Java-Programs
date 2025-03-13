package basicProgram;
interface LogicalOperator1
{
	void and();
	void or();
}
interface LogicalOperator2 extends LogicalOperator1
{
	void not();
	void equal();
}
public class Interface_MultiLevel implements LogicalOperator2{
	int a = 20;
	int b = 10;
	int c= 20;
	public static void main(String[] args) {
		Interface_MultiLevel im = new Interface_MultiLevel();
		im.and();
		im.or();
		im.not();
		im.equal();
	}
	public void and() {
	if(a>=b && a>=c)
	{
		System.out.println("AND operator");
	}
	}
	public void or() {
		if(a>=b || b>=c)
		{
			System.out.println("OR operator");
		}
	}
	public void not() {
		if(a!=b)
		{
			System.out.println("Not operator");
		}
	}

	public void equal() {
		if(a==c)
		{
			System.out.println("Equal operator");
		}
		
	}

}
