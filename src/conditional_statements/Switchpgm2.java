package conditional_statements;

public class Switchpgm2 {

	public static void main(String[] args) {
		//+ - * /
		char c='/';
		int a=10,b=5;
		
		switch(c)
		{
			case '+':
				System.out.println(a+b);
				break;
				
			case '-':
				System.out.println(a-b);
				break;
				
			case '*':
				System.out.println(a*b);
				break;
				
			case '/':
				System.out.println(a/b);
				break;
				
			default:
				System.out.println("invalid value");
		}
		

	}

}
