package exercise;

public class DuplicatecharFromString {

    public static void main(String[] args) {
        // input string
        String string = "Rahul Rajput";
 
        // covert the string to the char array
        char s[] = string.toCharArray();
        // Traverse the string from left to right
        System.out.print("The duplicate characters in the string are: ");
        for (int i = 0; i < s.length; i++) {
            int count = 1;		            // For each character count the frequency
            if (s[i] == '0')		        // s[i] == '0' means we have already visited this char so no need to count its frequency again.
                continue;
            for (int j = i+1; j<s.length; j++) {
                if (s[i] == s[j]) {
                    count++;	             // If a match found increase the count by 1
                }
            }
            if (count > 1) {
                System.out.print(s[i] + " ");
            }
        }
    }
}
