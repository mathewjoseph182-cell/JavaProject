package inheritancepackage;

class Mobile{
	public void mobilemethod()
	{
		System.out.println("Mobile class method");
	}
}

class Samsung extends Mobile
{
	public void samsungmethod() 
	{
		System.out.println("Samsung method");
	}
}

class Iphone extends Mobile
{
	public void iphonemethod() 
	{
		System.out.println("Iphone method");
	}
}


public class Hierarchial {

	public static void main(String[] args) {
		Samsung obj=new Samsung();
		obj.mobilemethod();
		obj.samsungmethod();
		Iphone iphoneobj=new Iphone();
		iphoneobj.mobilemethod();
		iphoneobj.iphonemethod();

	}

}
