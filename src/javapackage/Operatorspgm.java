package javapackage;

public class Operatorspgm {

	public static void main(String[] args) {
		//Arithmetic Operators
		System.out.println("Arithmetic Operators");
		int a=5;
		int b=3;
		System.out.println("Addition= "+(a+b));
		//System.out.println(a+b);
		
		System.out.println("Substration= "+(a-b));
		System.out.println("Multiplication= "+(a*b));
		System.out.println("Division= "+(a/b)); // Quotient value=1
		System.out.println("Modulus= "+(a%b)); // Reminder value=2
		
		//Assignment Operators
		System.out.println("Assignment Operators");
		//a=b;  values of b will be assigned to a
		System.out.println(a+=b);  // a=a+b updated value of a is 8
		System.out.println(a-=b);  // a=a-b updated value of a is 5

		//Relational Operators - the result of relational operator will be boolean (true or false)
		System.out.println("Relational Operators");
		System.out.println("value of a= "+a);
		System.out.println("value of b= "+b);
		System.out.println(a==b); //false
		System.out.println(a>b);  //true
		System.out.println(a>=b); //true
		System.out.println(a<b);  //false
		System.out.println(a<=b);  //false
		System.out.println(a!=b);  //true
		
		//Logical Operators
		System.out.println("Logical Operators");
		String username = "abc";
		String password = "1234";
		System.out.println("AND"); //check both conditions is true
		System.out.println(username =="abc" && password =="1234");
		System.out.println("OR");  // check either one condition is true
		System.out.println(username =="abc" || password =="123456");
		System.out.println("NOT");  //direct result
		System.out.println(!(username =="abc"));
		
		//Unary Operator
		System.out.println("Unary Operators");
		// ++increment by 1      -- decrement by 1
		//post increment -perform action then increment
		
		int i=3;
		System.out.println(i); //3
		System.out.println(i++); //3 Here the value of i print first then perform action
		System.out.println(i);  //4
		
		System.out.println(i--);  //4
		System.out.println(i);    //3
	
		// Pre increment - increment the perform then action
		int j=10;
		System.out.println(++j);
		System.out.println(--j);
		System.out.println("Ternary Operators");
		//?, Used for Decision making
		// variable name=condition? exp1 exp2;
		// exp1 print when condition is true exp2 print when condition is false
		//variable data type depends upon the type of exp
		
		int x=30, y=40;
		
		String s= x>y? "x is greater": "y is greater";
		System.out.println(s);
		
		Boolean s1= x>y? true: false;
		System.out.println(s1);
	}

}
