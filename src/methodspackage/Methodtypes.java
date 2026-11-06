package methodspackage;

public class Methodtypes {

	public static void main(String[] args) {
	Methodtypes obj=new Methodtypes();
	int result=obj.add(2, 5); // calling the method addition to store the result to a variable
	System.out.println("Addition: "+result);
	
	obj.sub(); //calling the methods substraction
	
	obj.multi(5, 4); //calling method multi and passing parameters
	
	int value=obj.div(); //calling the method div to store the result to a variable
	System.out.println("Division: "+value);
	
	//System.out.println("Division: "+obj.div());
	
	}
	
	//methods
	//1.with parameter and with return type
	public int add(int a, int b)
	{
		return a+b; // the value will be returned to the main method
	}
	
	//2.method with parameters and without return type
	int x=12,y=6;
	public void sub()
	{
		System.out.println("substraction: "+(x-y));
	}
	
	//3.method with parameter and without return type
	public void multi(int a, int b)
	{
		System.out.println("Multiplication: "+(a*b));
	}
	
	//4.method without parameter and with return type
	public int div()
	{
		return x/y;
		
	}
	
}
