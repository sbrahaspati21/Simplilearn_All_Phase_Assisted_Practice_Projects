package Method;

public class MethodCallbyvalue {

int val=150;

int operation(int val) {
	val =val*10/100;
	return(val);
}

public static void main(String args[]) {
	MethodCallbyvalue d = new MethodCallbyvalue();
	System.out.println("Before operation value of data is "+d.val);
	d.operation(100);
	System.out.println("After operation value of data is "+d.val);
	}
}