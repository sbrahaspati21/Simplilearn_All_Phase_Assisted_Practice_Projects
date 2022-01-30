package Map;
import java.util.*;
public class mapd {

	public static void main(String[] args) {
	
		//HASHMAP
		  System.out.println("\n"+"---------HASHMAP---------"+"\n");
		HashMap<String,String> hm = new HashMap<String,String>();
		
        hm.put("1","1");
        hm.put("2","SECOND");
        hm.put("3","THIRD");
        hm.put("4", "Hello");
		
        System.out.println("The elements of HashMap are "); 
		 for(Map.Entry m:hm.entrySet()){    
		       System.out.println(m.getKey()+" "+m.getValue());    
		      }
	    
	      
	     	      //TreeMap
	      System.out.println("\n"+"---------TREEMAP---------"+"\n");
	      TreeMap<String, Integer> marks = new TreeMap<String, Integer>();
	      
	        marks.put("Student1", 120);
	        marks.put("Student5", 99);
	        marks.put("Student6", 130);
	        marks.put("Student2", 190);
	        marks.put("Student3", 89);
	        marks.put("Student4", 142);
	        System.out.println("The elements of TreeMap are "); 
	        for(String key: marks.keySet()){
				System.out.println(key  +" : "+ marks.get(key));
	        }
	      
	      //HashTable
	       System.out.println("\n"+"---------HASHTABLE---------");
		   Hashtable<Integer,String> ht=new Hashtable<Integer,String>();  
		      
		      ht.put(4,"Ales");  
		      ht.put(5,"Rosy");  
		      ht.put(6,"Jack");  
		      ht.put(7,"John");  

		      System.out.println("\nThe elements of HashTable are ");  
		      for(Map.Entry n:ht.entrySet()){    
		       System.out.println(n.getKey()+" "+n.getValue());    
		      }   
		      
		      

	   }  
}