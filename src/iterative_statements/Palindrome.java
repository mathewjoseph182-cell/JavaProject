package iterative_statements;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number :");
		int a=sc.nextInt();
		int rem;
		int rev=0;
		int temp=a;
		System.out.println("Value of A :"+a);
		
		while(a>0)
		{
		rem=a%10; //123%10=3  //12%10=2   //1%10=1
		
		rev=(rev*10)+rem;  //0*10+3=3   //3*10+2=32   //32*10+1=321
		
		a=a/10; //123/10=12   //12/10=1   //1/10=0
		
		}
		System.out.println("the reversed value is : "+rev);
		
		//System.out.println("the value of a  : "+a);
		
		if(temp==rev)
		{
			System.out.println("the number is palindrome");
		}
		else
		{
			System.out.println("the number is not palindrome");
		}
	}

}
