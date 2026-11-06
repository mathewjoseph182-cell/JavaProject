package encapsulationandexception;

public class Exceptionpgm {

	public static void main(String[] args) {
		try //contains code which may contain execption
		{
		int a = 10;
		int b = 0;
		double c=a/b;
		System.out.println("value after division: "+c);
	}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("hi"); //executes only after successfully completing the 
	}

}
