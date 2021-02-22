public class FindMax
{ 
 public static void main(String[] args) 
 {
	Integer[] integerArr= {10,20,30,40,10};
	Double[] doubleArr= {100.0,200.0,300.0,400.0};
	Float[] floatArr= {200f,300f,500f,700f};
	String[] stringArr= {"strawberry","pineapple","guvava","tim","do"};
	printArr(integerArr);
	printArr(doubleArr);
	printArr(floatArr);
	printArr(stringArr);
	maxFind(integerArr);
	maxFind(doubleArr);
	maxFind(floatArr);
	findmaxString(stringArr);
	
	
	
	
 }
 
 public static<E>void printArr(E[] element)
 {	 
	 for(E i : element )
		 System.out.print(i+" ");
	 System.out.println();      
 }
 
 public static  <T extends  Comparable <T>> void maxFind(T[] element)
 {
	 T max=element[0];
	 for(T i:element)
	 {
		 if(i.compareTo(max)> 0)
		 {
			 max=i;
		 }
	 }System.out.println(max+" ");		
 }
 
 public static <T extends Comparable<T>> void findmaxString(T[] elements) {
	    T max = elements[0];
	    for (T i : elements) 
	    {
	      if (Integer.valueOf(i.toString().length()).compareTo(Integer.valueOf(max.toString().length())) > 0) 
	      {
	        max = i;
	      }
	    }
	    System.out.println("the maximum value in array is " + max);
	  }
}