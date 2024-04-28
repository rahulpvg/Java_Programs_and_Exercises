package exercise;
public class PalindromeNo {
public static void main(String[] args) 
{
	int a = 1221;
	int b = a;
	int rem;
	int sum = 0;
	while(a>0)
	{
		rem = a%10; //getting remainder
		sum = (sum*10)+rem; 
		a= a/10;
	}
	if(b==sum)
	{
		System.out.println("Palindrome");
	}
	else
	{
		System.out.println("not Palindrome");
	}
}
}
