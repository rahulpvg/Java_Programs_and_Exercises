package exercise;
public class DuplicateNoFromArray {
	public static void m1() {
	//program to find duplicate elements from given array
	int a [] = {1,2,3,4,2,4,3,5};
	int size = a.length;
	System.out.print("Duplicate ele. of array a = ");
	for (int i=0; i<size; i++)
	{
		for(int j=i+1; j<size; j++)
		{
			if(a[i]==a[j])
			{
				System.out.print(a[j]+" ");
			}
		}
	}
	System.out.println();
	}
	public static void m2() {
	//program to find duplicate string elements from given array
	String a [] ={"aa","asd","aa","jj","fd","jj"};
	int size = a.length;
	System.out.print("Duplicate elements of String array a = ");
	for (int i=0; i<size; i++)
	{
		for(int j=i+1; j<size; j++)
		{	
			if(a[i]==a[j])
			{
				System.out.print(a[j]+" ");
			}
		}
	}
	}
	public static void main(String[] args) {
		DuplicateNoFromArray.m1();
		DuplicateNoFromArray.m2();
	}
}
