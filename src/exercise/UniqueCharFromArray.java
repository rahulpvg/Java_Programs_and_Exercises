package exercise;


public class UniqueCharFromArray {

	public static void main(String[] args) {
		UniqueCharFromArray.uniquecharUsingArray();
	    String str = "raha";
	    System.out.println();
	    for (int i = 0; i < str.length(); i++)
	    {
	    	int count =0;
	        for (int j = 0; j < str.length(); j++)
	        {
	            // checking if two characters are equal
	            if (str.charAt(i) == str.charAt(j) && i != j) 
	            {
	                count++;
	            }
	        }
	        if (count == 0)
	        {
	            System.out.print(str.charAt(i));
	        }
	    }
	}
	
	public static void uniquecharUsingArray ()
	{
        String str = "Life is Beautiful Enjoy every moment of it";
        for (int x=0; x<str.length(); x++)
        {
        	str.charAt(x);
        }
        str = str.toLowerCase();
        char a[] = str.toCharArray();
	    for (int i = 0; i < a.length; i++)
	    {
	    	int count = 1;
	        for (int j = i+1; j < a.length; j++)
	        {
	            if (a[i] == a[j] )   // checking if two characters are equal
	            {
	                count++;
	            }
	        }
	        if (count == 1)
	        {
	            System.out.print(a[i]);
	        }
	    }
	}
}
