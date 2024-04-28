
public class Practice {

	public static void main(String[] args) {
		int a = 12345;
		String b = Integer.toString(a);
		int size = b.length();
		int sum = 0;
		for (int i=0; i<size; i++)
		{
			// Convert each character back to an integer using Character.getNumericValue().
			sum = sum + Character.getNumericValue(b.charAt(i)); 
		}
		System.out.println(sum);
		
		
		 int number = 12345;
	     int sum1 = 0;
        // Iterate until the number becomes 0
        while (number > 0)
        {
            int rem = number % 10; 		// Get the last digit of the number
            sum1 = sum1 + rem;			// Add the last digit to the sum
            number = number/10;			// Remove the last digit from the number
        }
        System.out.println("Sum of digits of 12345 is: " + sum1);
        int sum2 = 0;
        while (sum1 > 0)
        {
            int rem = sum1 % 10; 		// Get the last digit of the number
            sum2 = sum2 + rem;			// Add the last digit to the sum
            sum1 = sum1/10;			// Remove the last digit from the number
        }
        System.out.println("Sum of digits of 12345 is: " + sum2);

	}
}
