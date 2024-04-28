package javaExamples;

public class Arguments {
	static int test(int a, int b)
	{
		int sum=a+b;
		System.out.println(sum);
		return (sum); //return type is used to take output from the` method
	}
	public static void main (StringExamples[] args)
	{
		int result=test(12,45);
			result=test(result,85);
			result=test(result,74);
			result=test(result,35);
			result=test(result,69);
			result=test(result,45);
	
	} 

}
 


//addition of 12,45,85,74,35,69,45