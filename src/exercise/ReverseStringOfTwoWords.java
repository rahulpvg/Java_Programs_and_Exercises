package exercise;

public class ReverseStringOfTwoWords {

	public static void main(String[] args) {
		
        String s = "Hello World";
        String[] ch = s.split(" ");
        String reverse = "";
        for (int i=0; i<ch.length; i++) {
        	String chr = ch[i];
            String rev = "";
            for (int j = chr.length() - 1; j >=0; j--) 
            {
                rev = rev + chr.charAt(j);
            }
            reverse = reverse + rev +" ";
        }
        System.out.println(reverse);
	}
}
