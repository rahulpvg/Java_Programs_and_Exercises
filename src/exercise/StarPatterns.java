package exercise;

public class StarPatterns {
	int rows = 5;
	public void p1 ()
	{
		for(int i=1; i<=rows; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void p2 () {
		System.out.println();
		for (int i=1; i<=rows; i++)
		{
			for(int j=(rows-1); j>=i; j--)
			{
				System.out.print(" ");
			}
			for(int k=1; k<=i; k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void p3() {
		System.out.println();
		for(int i=1; i<=rows; i++)
		{
			for(int j=rows; j>=i; j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void p4() {
		System.out.println();
		for(int i=1; i<=rows; i++)
		{
			for(int j=2; j<=i; j++)
			{
				System.out.print(" ");
			}
			for(int k=rows; k>=i; k--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void p5() {
		System.out.println();
		for(int i=1; i<=rows; i++)
		{
			for(int j=(rows-1); j>=i; j--)
			{
				System.out.print(" ");
			}
			for(int k=1; k<=i; k++)
			{
				System.out.print("*");
			}
			for(int k=2; k<=i; k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void p6() {
		System.out.println();
		for(int i=1; i<=rows; i++)
		{
			for(int j=2; j<=i; j++)
			{
				System.out.print(" ");
			}
			for(int k=rows; k>=i; k--)
			{
				System.out.print("*");
			}
			for(int k=(rows-1); k>=i; k--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
	public void p7() {
		System.out.println();
		for(int i=1; i<=rows; i++)
		{
			for(int j=(rows-1); j>=i; j--)
			{
				System.out.print(" ");
			}
			for(int k=1; k<=i; k++)
			{
				System.out.print("*");
			}
			for(int k=2; k<=i; k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1; i<=rows; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print(" ");
			}
			for(int k=rows-1; k>=i; k--)
			{
				System.out.print("*");
			}
			for(int k=(rows-2); k>=i; k--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		StarPatterns star = new StarPatterns ();
		star.p1();
		star.p2();
		star.p3();
		star.p4();
		star.p5();
		star.p6();
		star.p7();
	}

}
