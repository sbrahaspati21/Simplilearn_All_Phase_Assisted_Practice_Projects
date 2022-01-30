package Keyword_and_CUSTOM_EXCEPTION;

import java.io.IOException;;  

public class For_throws{  
	
  void m() throws IOException{  
    throw new IOException("device error"); //checked exception  
  }  
  
  void n() throws IOException{  
    m();    // it doesnot have catch block so it will move to p() calling method with 
            // exception propogation
  }  
  
  void p(){  
   try{  
    n();  
   }
   catch(Exception e)
   {
	   System.out.println("exception handled");
	   System.out.println(e.getMessage());
	   System.out.println(e.getStackTrace());
	   System.out.println(e.getClass());
   }  
  }  
  
  public static void main(String args[]){  
	   For_throws obj=new For_throws();  
	   obj.p();  
	   System.out.println("normal flow...");  
  }  
  
}  
