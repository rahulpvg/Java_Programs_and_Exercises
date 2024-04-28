package exercise;

public class SwapTwoNo {

	public static void main(String[] args) {
		//By using third variable
		int a = 100;
		int b = 200;
		int c;
		c=a; 	
		a=b;	
		b=c;
		System.out.println(a);
		System.out.println(b);
		
		//without using third variable
		int x = 10;
		int y = 20;
		x=x+y; 	//30=10+20
		y=x-y;	//10=30-20
		x=x-y;  //20=30-10
		System.out.println(x);
		System.out.println(y);	
		
		//To calculate the cube of given value
		int z=3;
		z=z*z*z;
		System.out.println(z);
		

	}
}
