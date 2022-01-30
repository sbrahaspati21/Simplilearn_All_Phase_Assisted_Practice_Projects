package Constructor;

public class ParameterisedConstructor {
	
	int length;
	int breadth;
	int area;
	ParameterisedConstructor(int a, int b)
	{
	System.out.println("Parameterised Constructor");
	length=a;
	breadth=b;
	area = length*breadth;
	}
	
	void method() {
		System.out.println("Area of Rectangle is : " + area);
		
	}
	public static void main(String[] args) {
		ParameterisedConstructor p = new ParameterisedConstructor(4,7);
				p.method();

	}

}
