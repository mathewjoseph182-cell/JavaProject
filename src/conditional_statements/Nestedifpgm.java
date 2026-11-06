package conditional_statements;

public class Nestedifpgm {

	public static void main(String[] args) {
		int age=25,weight=45;
		if (age>=18)
		{
			if(weight>=50)
			{
				System.out.println("Eligible"); //the msg will be executed only if the both conditions become true
			}
			else
			{
				System.out.println("Underweight"); //Result will be returnrd if condition 2 is false
			}
		}
		else
		{
			System.out.println("Not Eligible"); //Result will be returnrd if condition 1 is false
		}
		

	}

}
