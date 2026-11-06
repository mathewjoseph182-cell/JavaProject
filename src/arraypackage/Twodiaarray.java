package arraypackage;

import java.util.Scanner;

public class Twodiaarray {

	public static void main(String[] args) {
		// 2x3 matrix
		// 2 rows
		//3 columns
		int [][] arr=new int[2][3];
		Scanner sc= new Scanner(System.in);
//		arr[0][0]=5; //0th row 0th column
//		arr[0][1]=6;
//		arr[0][2]=2;
//		arr[1][0]=3;
		
		System.out.println("Enter the values");
		
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<3;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("The values are : ");
		
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
