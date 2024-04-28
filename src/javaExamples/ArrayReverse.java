  package javaExamples;
public class ArrayReverse {
	public static void m1()
	{
		int a [] = {11,12,13,14,15,16,17,18,19,20};
		int size = a.length;
		int last_index = a.length-1;
		System.out.println("size of a = "+size);
		System.out.println("last index of a = "+last_index);
		int b [] = new int [10];
		int size1 = b.length;
		System.out.println("size of b = "+size1);
		
		for(int i=0; i<=last_index; i++)
		{
			b[i] = a[last_index-i];
		}
		a = b;  //assign data of array b to array a
		for(int i=0; i<=last_index; i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	public static void m2 ()
	{
		int a [] = {11,12,13,14,15,16,17,18,19,20};
		int size = a.length;
		int last_index = size-1;
		System.out.println("size of a = "+size);
		System.out.println("last index of a = "+last_index);
			
		for(int i=0; i<=(last_index/2); i++)
		{
			int c = a[i];	//backup var. for temp. use
			a[i] = a[last_index-i];
			a[last_index-i] = c;
		}	
		for(int i=0; i<=last_index; i++)
		{
			System.out.print(a[i]+" ");
		}
	}
	public static void main(StringExamples[] args) {
		ArrayReverse.m1();
		System.out.println("by swapping");
		ArrayReverse.m2();
	}
}
