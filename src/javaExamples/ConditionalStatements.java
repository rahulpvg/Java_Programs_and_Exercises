package javaExamples;

public class ConditionalStatements {

	public static void main(StringExamples[] args) {
		int a=55;
		int b=100;
		int c=60;
		
		if(a<b)
		{
			System.out.println("b is grater than a"); //True
			
		}
		
		if (b<c)
		{
			System.out.println("b is greater than c"); //True
		}
		else
		{
			System.out.println("c is greater than b"); //False
		}
	}

}
