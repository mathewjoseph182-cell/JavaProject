package polymorphismpkg;

public class Methodoverloading {
	
	public void add(int a,int b)
	{
		System.out.println("Method 1 :"+ (a+b));
	}

	public void add(int a,int b,int c)
	{
		System.out.println("Method 2 : "+ (a+b+c));
	}

	public void add(int a,double b)
	{
		System.out.println("Method 3 :"+ (a+b));
	}

	public void add(double a,int b)
	{
		System.out.println("Method 4 :"+ (a+b));
	}
	
	
	

	public static void main(String[] args) 
	{
		Methodoverloading obj=new Methodoverloading();	
		obj.add(5, 4, 1);// Method 2
		obj.add(10.5, 5);// Method 4
		obj.add(8, 6.5); // Method 3
		obj.add(5, 3); // Method 1
	}

}
