package iterative_statements;

public class Pattern_star_triangle {

	public static void main(String[] args) {
		//*
		//**
		//***
		for(int i=1;i<=3;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print	("*");
			}
			System.out.println();
		}

	}

}
