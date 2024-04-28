package constructorEx;

import Inheritance.Kolkata;

public class Mumbai extends Kolkata {

	public static void main(String[] args) {
	Kolkata f = new Kolkata();
	Mumbai l=new Mumbai ();
//	System.out.println(l.a);	//Default Property can not be inheritated and can not be called outside of Package
	//Protected property can be inherited outside the package but cannot be called outside the package
	System.out.println(l.b+" Protected Property"); 
	//Public property can be inherited and can be called throughout the project
	System.out.println(l.s+" Public Property");
	

	}

}
