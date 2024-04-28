package exercise;

public class A {

	int m2() {
		System.out.println("I am in m2");
		return 5;
	}
	void m1(int i) {
		System.out.println(" i am in m1");
	}
	public static void main(String[] args) {
		A aa = new A();
		aa.m1(aa.m2());
	}
	
	
//	String m2() {
//		System.out.println("11111");
//		return "hello";
//	}
//	void m1(String x) {
//		System.out.println("22222");
//	}
//	public static void main(String[] args) {
//		A aa = new A();
//		
//		//aa.m1(aa.m2());
//		String xxx = aa.m2();
//		
//		aa.m1("xxx");
//		
//	}
}


