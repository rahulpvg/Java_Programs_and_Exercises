package javaExamples;

public class Array {

	public static void main(StringExamples[] args) {
		
		int a [] = {11,12,13,14,15,16,17,18,19,20};
		int size = a.length;
		System.out.println("Single element from array= "+a[2]);
		System.out.println("size of a = "+size);
		for(int x=0; x<=(a.length-1); x++)
		{
			System.out.println(a[x]);
		}
		System.out.print("a = ");
		for(int x=0; x<=(a.length-1); x++)
		{
			System.out.print(a[x]+" ");
		}
		System.out.println();
		//Reverse array
		System.out.print("a = ");
		for (int y=(a.length-1); y>=0; y--)
		{
			System.out.print(a[y]+" ");
		}
		System.out.println();
		
		//array from size
		int b [] = new int [5];
		b[0] = 10;
		b[1] = 20;
		b[2] = 30;
		b[3] = 40;
		b[4] = 50;
		System.out.println(b[0]);
		System.out.println(b[1]);

		int size1 = b.length;
		System.out.println("size of b = "+size1);
		for (int x=0; x<=(b.length-1); x++)
		{
			System.out.print(b[x]+" ");
		}
		
	}
}
