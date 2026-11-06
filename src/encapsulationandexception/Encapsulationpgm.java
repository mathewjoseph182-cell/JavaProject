package encapsulationandexception;

class Employee
{
	private int id=5;
	private String name="mathew";
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}



public class Encapsulationpgm {

	public static void main(String[] args) {
		Employee obj = new Employee();
		//System.out.println("value of id "+obj.id);//id is a private variable 
		System.out.println("value of id : "+obj.getId());//accessing the private variable with getter
		obj.setId(10);//used to update value
		System.out.println("value of id after updation : "+obj.getId());
		System.out.println("value of name : "+obj.getName());
		obj.setName("Mathew Joseph");
		System.out.println("value of name after updation : "+obj.getName());
	
	}

}
