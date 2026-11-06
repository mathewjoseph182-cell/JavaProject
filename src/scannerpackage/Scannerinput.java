package scannerpackage;

import java.util.Scanner;

public class Scannerinput {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Roll Number");
		int a= sc.nextInt();
		
		System.out.println("Enter Name");
		String n= sc.next();
		
		
		sc.nextLine();
		
		System.out.println("Enter address");
		String ad= sc.nextLine();
		
		System.out.println("Grade");
		char g= sc.next().charAt(0);

		System.out.println("Height");
		double d= sc.nextDouble();
		
		System.out.println("Enter the Roll Number: "+a);
		System.out.println("Enter Name: "+n);
		System.out.println("Enter address: "+ad);
		System.out.println("Grade: "+g);
		System.out.println("Height: "+d);
	}

}
