package scannerpackage;

public class Variabletypes 
{

	int a; //instance variable
	int b=5; //instance variable
	static int c=10; //static variable
	
	public void display()
	{
		System.out.println("the value of a = "+a);
		System.out.println("the value of b = "+b);
		System.out.println("the value of c = "+c);
		
		int x=15; //local variable	
		System.out.println("the value of x = "+x);
	}
	
	public static void main(String[] args) 
	{
		Variabletypes obj=new Variabletypes(); //object declaration
		obj.a=2; //assigning value to instance variable
		obj.display(); //calling method using object
		
		System.out.println("the value of instance variable = "+obj.b); //calling instance variable using the help of object
		
		System.out.println("the value of static variable = "+c); //calling static variable without using object
		//System.out.println(obj.x); //x is a local variable we cannot call it outside display() method
		
	}

}
