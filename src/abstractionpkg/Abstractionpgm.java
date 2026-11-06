package abstractionpkg;

abstract class Parent //abstract class
{
	abstract public void display(); //abstract method- method without implementation
	
	public void normalmthd() //its anormal method  without implementation
	{
		System.out.println("Normal Method");
	}
}

class Child extends Parent
{
	@Override
	public void display() {  //overrinding abstract method
		System.out.println("Abstract Method");	
	}	
}


public class Abstractionpgm {

	public static void main(String[] args) {
		Child obj = new Child();
		obj.display(); // calling abstract method using child class method
		obj.normalmthd();  // calling normal method using child class method

	}

}
