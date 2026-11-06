package accessmodifierpkg;

public class Sample {

	public static void main(String[] args) {
		Accessmodifierpgm obj = new Accessmodifierpgm();
		//System.out.println("Private varaible : "+obj.a); // because A is a private variable
		System.out.println("Default varaible : "+obj.b);
		System.out.println("Protected varaible : "+obj.c);
		System.out.println("Public varaible : "+obj.d);

	}

}
