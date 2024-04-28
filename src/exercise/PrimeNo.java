package exercise;

public class PrimeNo {

	public static void main(String[] args) {
		int b = 19;
		int count = 0;
		for (int x=1; x<b; x++)
		{
			if(b%x==0)
			{
				count++;
			}
		}
		if(count==1)
		{
			System.out.println("This is prime no. = "+b);
		}
		else
		{
			System.out.println("This is not prime no. = "+b);
		}
	}
}
