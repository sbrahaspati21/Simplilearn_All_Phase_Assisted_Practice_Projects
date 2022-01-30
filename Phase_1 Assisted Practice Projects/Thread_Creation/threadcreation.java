package Thread_Creation;

public class threadcreation extends Thread {
	public void run(){  
		  System.out.println("thread is running...");  
		}  
		
		public static void main(String args[]){  
		
		threadcreation t1=new threadcreation();  
		t1.start();                            
	 }  

}
