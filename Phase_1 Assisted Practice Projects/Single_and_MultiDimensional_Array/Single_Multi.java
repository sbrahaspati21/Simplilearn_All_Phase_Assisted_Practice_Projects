package Single_and_MultiDimensional_Array;

public class Single_Multi {

public static void main(String[] args) {

	//SINGLEDIM ARRAY
	int a[]= {10,20,30,40,50};
	System.out.println("Single Dimensional Array\n");
	
	for(int i=0;i<5;i++) 
	{
		
		System.out.println("Elements of array a: "+a[i]);
	}

	System.out.println("--------------------------");
   
	//MULTIDIMESIONAL ARRAY
	
	int[][] b = { {2, 4, 6, 8}, {3, 6, 9} };
		System.out.println("\nMultiDimensional Array");
		System.out.println("\nLength of row 1: " + b[0].length);
		System.out.println("Length of row 2: " + b[1].length);
      }
}
