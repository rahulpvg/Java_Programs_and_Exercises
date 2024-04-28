package exercise;

public class ReverseString {

	public static void main(String[] args) {
		String a = "litaP luhaR";
		int size = a.length();
		String b = "";
		for (int i=(size-1); i>=0; i--)
		{
			b = b + a.charAt(i);
		}
		a = b;
		System.out.println(a);
		}
}