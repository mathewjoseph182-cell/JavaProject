package accessmodifierpkg;

public class Accessmodifierpgm {

	private int a=10;  //private
	int b=15;   //default
	protected int c=20;  //protected
	public int d=25;   //public
	
	
	public static void main(String[] args) {
		Accessmodifierpgm obj = new Accessmodifierpgm();
		System.out.println("Private varaible : "+obj.a);
		System.out.println("Default varaible : "+obj.b);
		System.out.println("Protected varaible : "+obj.c);
		System.out.println("Public varaible : "+obj.d);

	}

}
