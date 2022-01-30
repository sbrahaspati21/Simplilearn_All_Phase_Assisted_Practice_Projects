package Method;

public class MethodDemo {
 public int method(int a,int b){
	int add = a+b;
	return add;
	
	
 }
	public static void main(String[] args) {
		MethodDemo m = new MethodDemo();
		System.out.println("Addition of 2 no is : "+m.method(3, 4));
	}

}
