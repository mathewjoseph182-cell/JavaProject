package inheritancepackage;

class Animal  //parent class
{
	int a=5;
	public void animalmethod()
	{
		System.out.println("animal class method");
	}
}

class Dog extends Animal  //child class of animal
{
	public void dogmethod()
	{
		System.out.println("dog class method");
	}
}

class Puppy extends Dog   //child class of dog
{
	public void puppymethod()
	{
		System.out.println("puppy class method");
	}
}







public class Multilevel {

	public static void main(String[] args) {
		Puppy obj=new Puppy();
		System.out.println("value of a: "+obj.a);  // calling parent class(Animal) variable using child class object
		obj.animalmethod();// calling parent class method(animal) using child class object
		obj.dogmethod(); // calling parent class method(dog) using child class object
		obj.puppymethod(); // calling child class method(puppy) using child class object


	}

}
