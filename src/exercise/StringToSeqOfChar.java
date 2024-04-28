package exercise;

public class StringToSeqOfChar {

	public static void main(String[] args) {
	String a = "Rahul";
	int size = a.length();
	for(int i=0;i<size; i++)
	{
		char b = a.charAt(i);
		System.out.print(b +" ");
	}
	}

}
