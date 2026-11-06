package practicepgms;

class Member
{
    String name;
    int age;
    int salary;

    public void printdetails()
    {
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
        System.out.println("Salary : "+salary);
    }
}

class Employee extends Member
{
    String specification;
    public void empmethod()
    {
        //printdetails();
        System.out.println("Specification : "+specification);
    }
}

class Manager extends Member
{
    String department;
    public void managermethod()
    {
        //printdetails();
        System.out.println("Department : "+department);
    }
}

public class Hierarchialpgm {

		    public static void main(String[] args) {
		        Employee e=new Employee();
		        e.name="Mathew";
		        e.age=25;
		        e.salary=10000;
		        e.specification="Software Tester";
		        System.out.println("Employee Details");
		        e.printdetails();
		        e.empmethod();

		        System.out.println();

		        Manager m=new Manager();
		        m.name="john";
		        m.age=27;
		        m.salary=15000;
		        m.department="Testing";
		        System.out.println("Manager Details");
		        m.printdetails();
		        m.managermethod();
		
	}

}
