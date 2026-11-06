package accessmodifier2;

import accessmodifierpkg.Accessmodifierpgm;

public class Access2 extends Accessmodifierpgm {    //Access2 is the child of Accessmodifierpgm

	public static void main(String[] args) {
		Access2 obj = new Access2();
		//System.out.println("Private varaible : "+obj.a); //  A is a private variable it cannot be accessed
		//System.out.println("Default varaible : "+obj.b);  // B is a default variable it cannot be accessed
		System.out.println("Protected varaible : "+obj.c);
		System.out.println("Public varaible : "+obj.d);

	}

}
