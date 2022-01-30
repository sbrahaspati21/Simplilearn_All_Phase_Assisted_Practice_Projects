package Read_Write_Append;

import java.io.File;
import java.io.FileWriter;

public class Write_File {
  public static void main(String args[]) {

    String data = "This is the data in the output file";
    
    try {
  
      FileWriter output = new FileWriter("C://Users//sbrah//Desktop//Simplilearn//hello.txt");
      output.write(data);
      System.out.println("Data is written to the file.");

      output.close();
    }
    
    catch (Exception e) 
    {
      e.getStackTrace();
    }
 }
}