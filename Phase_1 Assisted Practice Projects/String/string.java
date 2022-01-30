package String;
public class string  {

	public static void main(String[] args) {
		//methods of strings
		System.out.println("Methods of Strings");
		
		String sl=new String("Hello World");
		System.out.println("1. Length of String");
		System.out.println(sl.length());

		String sub=new String("Welcome");
		System.out.println("\n"+"2. Substring of String");
		System.out.println(sub.substring(2));

		String s1="Hello";
		String s2="Heldo";
		System.out.println("\n"+"3. Comparision of String");
		System.out.println(s1.compareTo(s2));

		String s4="Hello";
		System.out.println("\n"+"4. ToLowerCase of String");
		System.out.println(s4.toLowerCase());
	
		String s5="";
		System.out.println("\n"+"5. IsEmpty of String");
		System.out.println(s5.isEmpty());

		String x="Welcome to Java";
		String y="WeLcOmE tO JaVa";
		System.out.println("\n"+"7. Equals of String");
		System.out.println(x.equals(y));
 
		System.out.println("\n");
		System.out.println("Creating StringBuffer");
		//Creating StringBuffer and append method
		StringBuffer s=new StringBuffer("Welcome to Java!");
		s.append("Enjoy your learning");
		System.out.println(s);

		//insert method
		s.insert(0, 'w');
		System.out.println(s);

		//replace method
		StringBuffer sb=new StringBuffer("Hello");
		sb.replace(0, 2, "hEl");
		System.out.println(sb);

		//delete method
		sb.delete(0, 1);
		System.out.println(sb);
		
		System.out.println("\n");
		System.out.println("Creating StringBuilder");
		StringBuilder sb1=new StringBuilder("Happy");
		sb1.append("Learning");
		System.out.println(sb1);

		System.out.println(sb1.delete(0, 1));

		System.out.println(sb1.insert(1, "Welcome"));

		System.out.println(sb1.reverse());
				
		//conversion	
		System.out.println("\n");
		System.out.println("Conversion of Strings to StringBuffer and StringBuilder");
		
		String str = "Hello"; 
        
       
        StringBuffer sbr = new StringBuffer(str); 
        sbr.reverse(); 
        System.out.println("Conversion of String to StringBuffer");
        System.out.println(sbr); 
          
        // conversion from String object to StringBuilder 
        StringBuilder sbl = new StringBuilder(str); 
        sbl.append("world"); 
        System.out.println("Conversion of String to StringBuilder");
        System.out.println(sbl);              		
	}
}