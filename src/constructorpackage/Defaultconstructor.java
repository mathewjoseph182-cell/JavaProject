package constructorpackage;

public class Defaultconstructor {
	int age;
	String name;

	public static void main(String[] args) {
		Defaultconstructor obj = new Defaultconstructor(); //Defaultconstructor() it is a default constructor without parameter
		obj.display();
	}

	public void display()
	{
		System.out.println("Age: "+age); //age=0  default value
		System.out.println("Name: "+name); //name=null  default value
		
	}
		
}
