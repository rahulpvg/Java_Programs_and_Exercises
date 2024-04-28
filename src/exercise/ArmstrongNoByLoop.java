package exercise;
import java.util.Scanner;
public class ArmstrongNoByLoop {
		public static void main(String[] args) {
	/*A number is thought of as an Armstrong number if the sum of its own digits 
	 raised to the power number of digits gives the number itself */
	//	0 and 1 also considered as Armstrong no.
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter any No.");
//		int a = sc.nextInt();
		int a = 373;
		int b = a;
		int rem,arm=0;
		while(a>0)
		{
			rem = a%10;
			arm = (rem*rem*rem)+arm;	//153, 370, 371, 407 (3 digitArmstrong)
			a = a/10;
		}
		if(b==arm)
		{
			System.out.println("Armstrng");
		}
		else
		{
			System.out.println("not Armstrng");
		}
	}
}
