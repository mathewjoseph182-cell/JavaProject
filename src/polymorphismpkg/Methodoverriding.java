package polymorphismpkg;

class Parent
{
	public void qualification()
	{
		System.out.println("BCA");
	
	}
}


class Child extends Parent
{
    // rightclick - source-override/implement methods
	
	@Override
	public void qualification() {
		System.out.println("Btech");
		super.qualification();  //calling immediate parent class method
	}
	
}


public class Methodoverriding {

	public static void main(String[] args) {
		Child obj=new Child();
		obj.qualification();
		
		
		//Parent obj1=new Parent();
		//obj1.qualification();
		

	}

}
