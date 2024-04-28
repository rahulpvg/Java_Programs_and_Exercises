package abstarct;
public class Execution {
	public static void main(String[] args) {
//	Kumar k = new Kumar ();
	
Rahul r = new Rahul ();
System.out.println(r.a);
r.test();	//abstract method with implementation provided in sub class
r.test1();	//abstract method with implementation provided in sub class
r.test2();	//complete method from abstract class
Kumar.test3();
Rahul.test3();
float a = 10.02f;
double b = a;
System.out.println(a);
System.out.println(b);
	}
}
