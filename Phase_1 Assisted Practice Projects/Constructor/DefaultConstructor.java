package Constructor;

public class DefaultConstructor {

	DefaultConstructor(){
		System.out.println("You are in Default Constructor");
	}
	
	void display(){
		System.out.println("This is Method Display");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DefaultConstructor c = new DefaultConstructor();
		c.display();
	}

}
