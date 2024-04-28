package exercise;

public class RevStringWithoutImpactSpecChars {
	public static void main(String[] args) {
		String str = "Rahul Patil";
		String str1 [] = str.split(" ");
		String reverse = "";
		for (int i=0; i<str1.length; i++)
		{
			String a = str1 [i];
			String rev = "";
			for (int j=(a.length()-1); j>=0; j--)
			{
				rev = rev + a.charAt(j);
			}
			reverse = reverse +rev+ " ";
		}
		System.out.println(reverse);
	}
}
