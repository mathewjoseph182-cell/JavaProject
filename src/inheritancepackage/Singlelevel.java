package inheritancepackage;

class Parent    //parent class
{
	int a=5;
	public void parentmethod()
	{
		System.out.println("parentmethod");
	}
}


class Child extends Parent   //child class inherits the properties of parent class
{
	public void childmethod()
	{
		System.out.println("childmethod");
	}
}



public class Singlelevel {

	public static void main(String[] args) {
		Child obj=new Child();
		System.out.println("value of a: "+obj.a);// calling parent class using variable child object
		obj.parentmethod(); //calling parent class method using child class
		obj.childmethod();

	}

}
