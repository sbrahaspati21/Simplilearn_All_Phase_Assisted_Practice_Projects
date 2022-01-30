package Object_Oriented_PIllars;

abstract class Bike {
	Bike() {
		System.out.println("bike is created");
	}

	abstract void run1();

	void changeGear()
	{
		System.out.println("gear changed");
	}
}

abstract class Honda extends Bike {
	
	Honda(){
		System.out.println("honda is created");
	}
	
	abstract void run();
	
	abstract void run1();
}
	

class Hello extends Honda {
	void run() {
		System.out.println("running safely..");
	}

	@Override
	void run1() {
		
		System.out.println("inside the run1 method");
	}	
}


public class Abstraction {
	public static void main(String args[]) {

		Honda k = new Hello(); 
	
		k.run();
		k.run1();
		k.changeGear();
		
	}
}
