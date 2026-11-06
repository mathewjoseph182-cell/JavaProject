package polymorphismpkg;

public class Staticfinal {
	int a=5;
	static String company="Luminar";
	final double pi=3.14;
	static final double piValue=3.14;
	
	

	public static void main(String[] args) {
		Staticfinal obj=new Staticfinal();
		System.out.println("value of a: "+obj.a);
		
		System.out.println("Name of company : "+company); //company is a static variable we can call without creating an object 
		company="Luminar technolab";// the value of static keyword can be updated
		System.out.println("Updated name : "+company);
		System.out.println("value of pi : "+obj.pi);
		//obj.pi= 4.15; the value of final variable cannot be modified
	
		System.out.println("value of piValue : "+piValue); // variables declared using 'static final'
	}

}
