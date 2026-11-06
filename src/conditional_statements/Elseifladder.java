package conditional_statements;

public class Elseifladder {

	public static void main(String[] args) 
	{
		int a=5,b=8,c=10;
		if(a>b && a>c)
		{
			System.out.println("a is greater");
		}
		else if(b>a && b>c)
		{
			System.out.println("b is greater");
		}
		else
		{
			System.out.println("c is greater");
		}

	}

}
