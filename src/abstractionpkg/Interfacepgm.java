package abstractionpkg;


interface Bike {
 abstract public void speedlimit(); 
 public void accelarate();
}


class Honda implements Bike {
 @Override
 public void speedlimit() {
     System.out.println("Honda Speed limit");
 }

 @Override
 public void accelarate() {
     System.out.println("Honda accelaration");
 }
}

public class Interfacepgm {
 public static void main(String[] args) {
        
     Bike obj = new Honda(); //interface interface ref name=new classname();
     obj.speedlimit();
     obj.accelarate();
 }

	}


