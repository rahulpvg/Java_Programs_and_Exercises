

package exercise;

public class PatternsLoop {
	//Patterns by using Loops
	public static void main(String[] args) {
		System.out.println("1st pattern output");
	 for(int a=0; a<=3; a++)		//Line
	 {
		 for(int b=1; b<=a; b++)	//Star
		 {
			 System.out.print("*");
		 }
		 System.out.println();
	 }
	 PatternsLoop o=new PatternsLoop();
	 o.pattern2();
	 o.pattern3();
	 o.pattern4();
	 o.pattern5();
	 o.pattern6();
	 o.pattern7();
	 o.pattern8();
	}
	
	 public void pattern2() {
		 System.out.println("2nd pattern output");
		for(int a=1; a<=3; a++)		//Line
		 {
			 for(int b=3; b>=a; b--)	//Star
			 {
				 System.out.print("*");
			 }
			 System.out.println();
		 }
	}
	 public void pattern3() {
		 System.out.println("3rd pattern output");
		 for(int a=1; a<=3; a++)		//Line
		 {
			 for(int b=2; b>=a; b--)	//Star
			 {
				 System.out.print(" "); //Space
			 }
			 for(int b=1; b<=a; b++)	//Star
			 {
				 System.out.print("*"); //by spacing before * we can get triangle pattern
			 }
			 System.out.println();
		 }
		 
	 }
	 public void pattern4() {
		 System.out.println("4th pattern output");
		 for(int a=1; a<=3; a++)
		 {
			 for(int b=2; b<=a; b++)
			 {
				 System.out.print(" ");
			 }
			 for(int b=3; b>=a; b--)
			 {
				 System.out.print("*"); //by spacing before * we can get triangle pattern
			 }
			 System.out.println();
		 }
	 }
	 public void pattern5() {
		 System.out.println("5th pattern output");
		 for(int a=1; a<=3; a++)		//Line
		 {
			 for(int b=2; b>=a; b--)	//Star
			 {
				 System.out.print(" ");
			 }
			 for(int b=1; b<=a; b++)	//Star
			 {
				 System.out.print("*");
			 }
			 for(int b=2; b<=a; b++)	//Star
			 {
				 System.out.print("*");
			 }
			 System.out.println();
		 }
	 }
	 public void pattern6() {
		 System.out.println("6th pattern outpur");
		 for(int a=1; a<=3; a++)
		 {
			 for(int b=2; b<=a; b++)
			 {
				 System.out.print(" ");
			 }
			 for(int b=2; b>=a; b--)
			 {
				 System.out.print("*");
			 }
			 for(int b=3; b>=a; b--)	//Star
			 {
				 System.out.print("*");
			 }
			 System.out.println();
		 }
	 }
	 public void pattern7() {
		 System.out.println("7th pattern output");
		 for(int a=1; a<=3; a++)		//Line
		 {
			 for(int b=3; b>=a; b--)	//Star
			 {
				 System.out.print(" "); //Space
			 }
			 for(int b=1; b<=a; b++)	//Star
			 {
				 System.out.print(" *"); //by spacing before * we can get triangle pattern
			 }
			 
			 System.out.println();
		 }
		 for(int a=1; a<=3; a++)
		 {
			 for(int b=2; b<=a; b++)
			 {
				 System.out.print(" ");
			 }
			 for(int b=3; b>=a; b--)
			 {
				 System.out.print(" *");
			 }
			 System.out.println();
		 }
	 }
	 public void pattern8() {
		 System.out.println("8th pattern output");
		 for(int a=1; a<=3; a++)		//Line
		 {
			 for(int b=2; b>=a; b--)	//Star
			 {
				 System.out.print(" ");
			 }
			 for(int b=1; b<=a; b++)	//Star
			 {
				 System.out.print("*");
			 }
			 for(int b=2; b<=a; b++)	//Star
			 {
				 System.out.print("*");
			 }
			 System.out.println();
		 }
		 for(int a=1; a<=3; a++)
		 {
			 for(int b=2; b<=a; b++)
			 {
				 System.out.print(" ");
			 }
			 for(int b=3; b>=a; b--)
			 {
				 System.out.print("*");
			 }
			 for(int b=2; b>=a; b--)	//Star
			 {
				 System.out.print("*");
			 }
			 System.out.println();
		 }
	 }
}
