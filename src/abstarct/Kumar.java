package abstarct;
//abstract class
public abstract class Kumar {
	public int a=10;
	public abstract void test();	//incomplete method
	public abstract void test1();	//incomplete method
	public void test2()				//complete method
	{
		System.out.println("test2");
	}
	static void test3()
	{
		System.out.println("test3");
	}
}
 