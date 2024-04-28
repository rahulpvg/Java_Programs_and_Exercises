package javaExamples;
public class HighestNoExercise {
			//Program for Highest Number
	static int a=50;
	static int b=50;
	static int c=300;
	static int d=40;
	public static void main(StringExamples[] args) {
		System.out.println("Result by using comparison operators");
		if(a>=b)
		{
			if(a>=c)
			{
				if(a>=d)
				{
					System.out.println("a is greater");
				}
				else
				{
					System.out.println("d is greater");
				}
			}
			else if(a<=c)
			{
				System.out.println("c is greater");
			}
			else
			{
				System.out.println("d is greater");
			}
		}
		else if(b>=c)
		{
			if(b>=d)
			{
				System.out.println("b is greater");
			}
			else
			{
				System.out.println("d is greater");
			}
		}
		else if(c>=d)
		{
			System.out.println("c is greater");
		}
		else
		{
			System.out.println("d is greater");
		}
}
		//HighestNoExercise object=new HighestNoExercise();
		//object.logic();{
	//}
			//Program for highest number by using Logical operators
	public void logic ()
	{
		System.out.println("Result by using comparison & logical operators");
		if(a>=b && a>=c && a>=d)
		{
			System.out.println("a is greater");
		}
		else if(b>=a && b>=c && b>=d)
		{
			System.out.println("b is greater");
		}
		else if(c>=a && c>=b && c>=d)
		{
			System.out.println("c is greater");
		}
		else
		{
			System.out.println("d is greater");
		}
	}
}
