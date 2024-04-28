package javaExamples;

public class Nested_if {

	public static void main(StringExamples[] args) {
		int a=100;
		int b=150;
		int c=30;
		int d=80;
		
		if(a>c)
		{
			System.out.println("1st if stmt");
			if(c<b)
			{
				System.out.println("2nd if stmt");
				if(d>c)
				{
					System.out.println("3rd if stmt");
				}
			}
		}
		else
		{
			System.out.println("else stmt");
		}

	}

}
