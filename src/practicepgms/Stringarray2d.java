package practicepgms;

import java.util.Scanner;

public class Stringarray2d {

	public static void main(String[] args) {

		        String[][] ar = new String[3][2];

		        Scanner sc = new Scanner(System.in);

		        System.out.println("Enter the Names");

		        for (int i = 0; i < 3; i++) // row
		        {
		            for (int j = 0; j < 2; j++) // column
		            {
		                ar[i][j] = sc.next();
		            }
		        }

		        // sc.close();

		        System.out.println("Entered numbers are");

		        for (String v[] : ar) // Iterate over each row ar[0][0], ar[0][1]
		        {
		            for (String v1 : v) // Iterate over each element in the row ar[0][0], ar[0][1]
		            {
		                System.out.print(v1 + " "); // Display each cell value
		            }

		            System.out.println();
		        }

	}

}
