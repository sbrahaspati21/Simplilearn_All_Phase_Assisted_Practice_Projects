package Search_String;

import java.io.*; 
import java.lang.*; 
import java.util.*; 
 
public class search_string { 
 
     public static void main(String[] args) 
    {         
         String[] words = new String[]{"C++", "Java", "C", "Python"};
 
       
        List<String>wordslist = Arrays.asList(words);
        String search = "Java";
        if(wordslist.contains(search)){
           System.out.println("The word " + search + " present in string array");
        }
       else
       System.out.println("The word " + search + " not present in string array" );
    }
}