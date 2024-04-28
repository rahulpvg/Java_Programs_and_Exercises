package constructorEx;

public class ConstructorOverloading {
	 ConstructorOverloading ()
	 {
		 System.out.println("hi");
	 }
	 ConstructorOverloading(char a)
	 {
		 System.out.println("bye");
	 }
	 public static void main(String[] args) {
		new ConstructorOverloading();
		new ConstructorOverloading('x');
		
	}
}
