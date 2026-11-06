package constructorpackage;

public class Parameterizedconstr {
	int age;
	String name;
	
	//accesmodifier classname(parameters){} -syntax for parameterized constructor
	public Parameterizedconstr(int age,String name)
	{
		this.age=age; //this.age refers to the instance variable
		this.name=name;
	}
	
	public void display()  //normal method
	{
		System.out.println("Age: "+age);
		System.out.println("Name: "+name);
	}
	
	public static void main(String[] args) {
		
		Parameterizedconstr obj=new Parameterizedconstr(10,"Mathew"); //the call is passed to parameterized constructor argument
		obj.display();
		

	}

}
