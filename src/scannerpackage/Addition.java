package scannerpackage;

import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {
		int a;
		int b;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter two number");
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println(a+b);
	}

}
