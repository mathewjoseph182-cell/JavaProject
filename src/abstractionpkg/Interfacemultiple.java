package abstractionpkg;

interface bikedetails
{
	abstract public void colour();
	abstract public void speed();
}

interface vehicle
{
	abstract public void model();
}

class Yamaha implements bikedetails,vehicle  // multiple inheritance
{

	@Override
	public void model() {
		System.out.println("model methid");
		
	}

	@Override
	public void colour() {
		System.out.println("Colour method");
		
	}

	@Override
	public void speed() {
		System.out.println("Speed method");
		
	}
	
}




public class Interfacemultiple {

	public static void main(String[] args) {
		Yamaha obj = new Yamaha();
		obj.model();
		obj.colour();
		obj.speed();
		

	}

}
