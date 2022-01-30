package Read_Write_Append;

import java.io.FileReader;

public class Read_File {
  public static void main(String[] args) {

    char[] array = new char[60];
    
    try {
    
      FileReader input = new FileReader("C://Users//sbrah//Desktop//Simplilearn//hello.txt");

      input.read(array);
      System.out.println("Data in the file:");
      System.out.println(array);

      input.close();
    }
    catch(Exception e) {
      e.getStackTrace();
    }
  }
}