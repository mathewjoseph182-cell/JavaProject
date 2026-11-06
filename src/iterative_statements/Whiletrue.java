package iterative_statements;

public class Whiletrue {

	public static void main(String[] args) {
		int i=1;
		while(true) //executing while loop without giving any condition
		{
			System.out.println(i);
			i++;
			if(i==5)
			{
				break;	//to terminate the execution of the loop
			}
		}
	}

}
