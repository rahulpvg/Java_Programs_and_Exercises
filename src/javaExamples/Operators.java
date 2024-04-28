package javaExamples;

public class Operators {

	public static void main(StringExamples[] args) {
		int a=25;
		int b=15;
		int c;
		//Operations by using Arithmetic operators
		c=a+b;
		System.out.println(c);
		c=a-b;
		System.out.println(c);
		c=a*b;
		System.out.println(c);
		c=a/b;
		System.out.println(c);
		c=a%b;
		System.out.println(c);
		a++;
		System.out.println(a);
		b--;
		System.out.println(b);
		
		//Operations by using Relational/Comparison operators
		boolean d;
		d=a<b;
		System.out.println(d);
		d=a>b;
		System.out.println(d);
		d=a<=b;
		System.out.println(d);
		d=a>=b;
		System.out.println(d);
		d=a==b;
		System.out.println(d);
		d=a!=b;
		System.out.println(d);
		
		//Operations by using Logical operators
		
		boolean e=true;      // 1
		boolean f=false;	 // 0
		boolean g;
		
		g=e && f;
		System.out.println(g);
		g=e || f;
		System.out.println(g);
		g=!e;
		System.out.println(g);
	}

}
