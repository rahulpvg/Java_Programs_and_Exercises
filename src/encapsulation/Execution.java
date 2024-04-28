package encapsulation;
public class Execution {
	public static void main(String[] args) {
		Raj x = new Raj ();
		int d = x.m1();
		System.out.println(d);
		
		Raj y = new Raj (100);
		d = y.m1();
		System.out.println(d);

	}

}
