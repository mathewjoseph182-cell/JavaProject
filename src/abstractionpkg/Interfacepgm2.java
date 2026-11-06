package abstractionpkg;

interface Tvremote
{
	abstract public void poweron();
	abstract public void poweroff();
}

interface SmartTv extends Tvremote //inherits
{
	abstract public void display();
}

class Samsung implements SmartTv
{

	@Override
	public void display() {
		System.out.println("display method");
		
	}

	@Override
	public void poweron() {
		System.out.println("poweron method");
		
	}

	@Override
	public void poweroff() {
		System.out.println("poweroff method");
		
	}
	
}


public class Interfacepgm2 {

	public static void main(String[] args) {
		Samsung obj = new Samsung();
		obj.display();
		obj.poweron();
		obj.poweroff();

	}

}
