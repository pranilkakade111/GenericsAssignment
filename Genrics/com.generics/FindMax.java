
public class FindMax 
{
 public static void main(String[] args) 
 {
	Integer[] integerArr= {10,20,30,40,10};
	Double[] doubleArr= {100.0,200.0,300.0,400.0};
	Float[] floatArr= {200f,300f,500f,700f};
	printArr(integerArr);
	printArr(doubleArr);
	printArr(floatArr);
	maxFind(integerArr);
	maxFind(doubleArr);
	maxFind(floatArr);

	
 }
 
 public static<E>void printArr(E[] element)
 {
	 for(E i : element )
		 System.out.print(i+" ");
	 System.out.println();      
 }
 
 public static <T extends  Comparable <T>> void maxFind(T[] element)
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
}