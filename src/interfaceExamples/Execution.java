package interfaceExamples;

public class Execution {

	public static void main(String[] args) {
	Imp x = new Imp ();
	x.m1();
	x.m2();
// 	x.m3(); //Static method of interface can't be inherited into implementation class
	x.m4();
	
	System.out.println(x.a);
	System.out.println(Inter.a);
	System.out.println(Imp.a);
		
	}

}
