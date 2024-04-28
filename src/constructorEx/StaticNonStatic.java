package constructorEx;

public class StaticNonStatic {
	
		static int a=10;	//static var
				int b=20;	//instance or non static var
		public static void main(String[] args) {
			StaticNonStatic x=new StaticNonStatic();  
			StaticNonStatic y=new StaticNonStatic();
			System.out.println("for instance var");
			System.out.println("instance var "+x.b);	//value in x object = b = 20
			System.out.println("instance var "+y.b);	//value in y object = b = 20	
			x.b=100;
			System.out.println(x.b);	//value in x object = b = 100
			System.out.println(y.b);	//value in y object = b = 20
			
			System.out.println("for Static var");
			System.out.println("static var "+x.a);  	//value in x object = a = 10
			System.out.println("static var "+y.a);		//value in y object = a = 10
			x.a=100;
			System.out.println(x.a);					//value in x object = a = 100
			System.out.println(y.a);					//value in x object = a = 100
		}
}
