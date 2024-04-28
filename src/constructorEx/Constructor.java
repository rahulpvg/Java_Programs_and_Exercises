package constructorEx;

public class Constructor {
	Constructor(int b)
	{
		System.out.println("hi");
		int c=12+b;
		System.out.println(c);
	}
	public static void main(String[] args) {
		new Constructor(20);

	}
}

