package encapsulation;
public class Raj {
	private int a;
	private int b;
	Raj ()
	{
		a = 10;
		b = 20;
	}
	Raj (int p)
	{
		a = 30;
		b = 40;
	}
	public int m1()
	{
		int c = a + b;
		return c;
	}
}
