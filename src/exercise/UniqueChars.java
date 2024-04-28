package exercise;

public class UniqueChars {

	public static void main(String[] args) {
        String str = "Life is Beautiful Enjoy every moment of it";
        findUniqueChars(str);
    }

    public static void findUniqueChars(String str) {
        boolean[] visited = new boolean[256]; // Assuming ASCII characters

        System.out.println("Unique characters in the string: ");
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!visited[ch]) 	       // If character is not visited yet, mark it as visited and print it
            {
                System.out.print(ch );
                visited[ch] = true;
            }
        }
	}

}
