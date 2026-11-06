package polymorphismpkg;

public class Areaoverloading {

	public void area(int side) {
	        System.out.println("Area of square : "+side * side);
	       
	    }

	    public void area(int l, int b) {
	        System.out.println("Area of rectangle : "+l*b);

	    }

	    public void area(int b, double h) {
	        System.out.println("Area of triangle : "+0.5 * b * h);
	        
	    }

	    public static void main(String[] args) {
	        Areaoverloading obj = new Areaoverloading();
	        obj.area(5);
	        obj.area(4, 5);
	        obj.area(4, 5.5);
	    }
	}