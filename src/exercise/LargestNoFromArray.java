package exercise;

public class LargestNoFromArray {

	public static void main(String[] args) {
	int a [] = {11, 10, 780, 405, 23};
	int size = a.length;
	System.out.println("Size of a = "+size);
	for(int i=0; i<size; i++)
	{
		for(int j=i+1; j<size; j++)
		{
			if(a[i] > a[j])
			{
				int b = a[i];
				a[i] = a[j];
				a[j] = b;	
			}
		}
	}
	System.out.println("Largest no. of a = "+a[size-1]); //largest
	System.out.println("Largest no. of a = "+a[size-2]); //2nd Largest

	}
}
