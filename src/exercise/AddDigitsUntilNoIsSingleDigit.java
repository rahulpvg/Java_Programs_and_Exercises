package exercise;

public class AddDigitsUntilNoIsSingleDigit {

	public static void main(String[] args) {	
        
        int a = 1234567;
        while (a > 9) 			// Continue looping until the number becomes a single digit
        {
        	int rem;
            int sum = 0;
            while (a > 0)       // Calculate the sum of digits of the current number
            {
            	rem = a % 10;
                sum = sum + rem;
                a = a/10;
            }
            a = sum;            // Update the number with the sum
        }
        System.out.println("The final single-digit sum is: " + a);
	}
}
