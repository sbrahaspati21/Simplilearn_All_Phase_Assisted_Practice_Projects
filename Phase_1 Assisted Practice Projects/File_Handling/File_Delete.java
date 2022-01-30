package File_Handling;

import java.io.File;
import java.io.IOException;

public class File_Delete {
	   
	   public static void main(String[] args) {
		   
		   try {  
	            File file = new File("C://Users//sbrah//Desktop//Simplilearn//hello.txt");  // this is used to create the file
	            
	            if (file.createNewFile()) {  
	                System.out.println("New File is created!");  
	            } else {                   
	                if(file.exists())
	                {
	                    System.out.println("File already exists.");	
	                }
	                else
	                {
	                	System.out.println("File doesnot exists.");
	                }
	               
	                //DELETE
	                
	                boolean b = file.delete();
	                if(b==true)
	                {
	                	System.out.println("File deleted !!");
	                }
	                else
	                {
	                	System.out.println("File not deleted");
	                }
	               
	            }  
	        } catch (IOException e) {  
	            e.printStackTrace();  
	        }  	
	   }
	}
