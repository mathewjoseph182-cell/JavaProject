package stringpackage;

public class Stringmethods {

	public static void main(String[] args) {
		String s1="hello";
		String s2="Hello";
		String s3= new String("Hello");
//		if(s2==s3) // the result will be false because == comparing reference number not the value
//		{
//			System.out.println("values are equal");	
//		}
//		else
//		{
//			System.out.println("values are not equal");
//		}
		//equals()
		if(s2.equals(s3))
		{
			System.out.println("values are equal");	
		}
		else
		{
			System.out.println("values are not equal");
		}
		
		//equalsIgnoreCase()
		if(s1.equalsIgnoreCase(s2))
		{
			System.out.println("values are equal");	
		}
		else
		{
			System.out.println("values are not equal");
		}
		
		
		//concat()
		String s4="World";
		System.out.println(s1.concat(s4)); //Helloworld
		
		//contains()
		System.out.println(s4.contains("Wo"));
		
		//toUpperCase()
		System.out.println(s1.toUpperCase()); //HELLO
		
		//toLowerCase
		System.out.println(s1.toLowerCase()); //hello
		
		//length
		System.out.println(s1.length());
		
		//trim() -remove the white space from starting and ending
		String s5=" Hello ";
		System.out.println("Before trim:"+s5);
		System.out.println("After trim :"+s5.trim());
		
		//startswith() - starts with a specific word
		String s6="Hello Everyone Good Morning";
		System.out.println(s6.startsWith("Hello"));
		System.out.println(s6.endsWith("Morning"));
		
		//charAt(index position)
		System.out.println(s6.charAt(2));
		
		//substring(start index,end index)
		System.out.println(s6.substring(0,12));  //end index value will not print
		
		//split() -to split a sentence based on a condition
		String [] result=s6.split(" ");
		for(String v:result)
		{
			System.out.println(v);
		}
		
		System.out.println("The Number of words: "+result.length);
		
		//toCharArray() to retrieve as single character from a string
		String s7="Mathew Joseph";
		char [] ar=s7.toCharArray();
		System.out.println("Result of char array");
		for(char c:ar)
		{
			System.out.println(c);
		}
		 
		//replace() -to replace specify word from a sentence
		System.out.println(s6.replace("Hello", "Hi"));
		
	}

}
