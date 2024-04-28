package exercise;

public class PrimeNoFromArray 
{	public static void main(String[] args)
	{	int a[] = {5,10,11,23,11,2};
		int size =a.length;
		System.out.println(size);
		System.out.print("prime No. from Array a = ");
		for(int i=0; i<size; i++)
		{
			int count = 0;
			for(int y=1; y<a[i]; y++)
			{
				if(a[i]%y==0)
				{
				count ++;
				}
			}
			if(count==1)
			{
				System.out.print(a[i]+" ");
			}		
		}
	}
}
