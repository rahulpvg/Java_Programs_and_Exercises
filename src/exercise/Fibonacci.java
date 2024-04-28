package exercise;

public class Fibonacci {

	public static void main(String[] args) {
// A series of no. in which each no. is the sum of the two proceeding numbers.
// 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181 etc
		int a = 0;
		int b = 1;
		System.out.print(a+" "+b+" ");
		int c;
		for(int i=1; i<5; i++)
		{
			c = a + b;
			 a = b;
			 b = c;
			System.out.print(b+" ");
		}
	}

}
