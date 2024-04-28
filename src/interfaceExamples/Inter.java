package interfaceExamples;

public interface Inter {
	//Interface
	int a = 10;  	// Public static final (final = once declared variables value can't be changed its final) 
	void m1 ();		// Public abstract	
	void m2 ();		// Public abstract
	static void m3 ()
	{
		System.out.println("m3 executed");
	}
	default void m4 ()
	{
		System.out.println("m4 executed");
	}
}
