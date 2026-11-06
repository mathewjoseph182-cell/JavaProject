package practicepgms;

public class Javapgm2 {

	    public static void main(String[] args) {
	        int num1 = 23;
	        int num2 = 45;

	        System.out.println(num1 == num2);

	        // OR
	        String res = num1 == num2
	                ? "The numbers are equal."
	                : "The numbers are not equal.";

	        System.out.println(res);
	    }
	}