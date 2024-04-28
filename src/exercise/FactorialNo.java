package exercise;

public class FactorialNo {
	public static void main(String[] args) {
//Factorial of n is the product all positive descending integers
		int x=4;
		int y=x;
		for(int i=1; i<x; i++)		//4*3*2*1
		{
			y = y*i;    //4=8=24
		}
		System.out.println("Factorial of "+x+" = "+y);	
	}	
}
