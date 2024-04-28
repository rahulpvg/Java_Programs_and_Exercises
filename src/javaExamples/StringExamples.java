package javaExamples;
public class StringExamples {
	public static void main(java.lang.String[] args) {
		String a = "Rahul";
		String b = "Patil";
		String c = "rahul";
		//by equal method
		boolean x = a.equals(b);
		System.out.println(x);
		boolean y = a.equals(c);
		System.out.println(y);
		//by equalIgnoreCase method
		boolean q = a.equalsIgnoreCase(c);
		System.out.println(q);
		//by length method
		int w = a.length();
		System.out.println(w);
		//by charAt method
		char e = a.charAt(2);
		System.out.println(e);
		//cocncat method
		String r = a.concat(b);
		System.out.println(r);
		String t = a.concat("dada");
		System.out.println(t);
		//concat by using + operator
		String p = a + c;
		System.out.println(p);
		//String reverse
		String u= ""; //Deceleration and initialization of string
		for (int z=(w-1); z>=0; z--)
		{
			u = u + a.charAt(z);
		}
		a = u;
		System.out.println("string reverse = "+a);

		//uppercase method
		String v = b.toUpperCase();
		System.out.println(v);
		//lowercase method
		String n = b.toLowerCase();
		System.out.println(n);
		
		//trim method
		String k = "     rajput  ";
		String g = k.trim();
		System.out.println(g);
		
		

	}

}
