package Inheritance;

public class Delhi extends Chennai {
	int c=30;
	public static void m1 ()
	{
		System.out.println("Hi Delhi");
	}
	public void m2 ()
	{
		System.out.println("Hello Delhi");
	}	
	public static void main(String[] args) {
		
	Chennai z = new Chennai();
	z.m2();
	Chennai.m1();
	System.out.println(Chennai.a);
	System.out.println(z.b);
	
	int t =a+100;
	System.out.println(t);
	int w =a+(z.b);
	System.out.println(w);
	
	}

}
