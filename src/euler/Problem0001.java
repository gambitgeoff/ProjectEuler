package euler;

/**
 * If we list all the natural numbers below
 * 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. 
 * 
 * The sum of these multiples is 23. Find the sum of all
 * the multiples of 3 or 5 below 1000.
 * 
 * Answer: 233168
 * 
 * @author gambitgeoff
 *
 */
public class Problem0001 
{
	public static void main(String [] args)
	{
		int sum = 0;
		for (double i=0.0;i<1000.0;i++)
		{
			if (i % 3 == 0)
			{
				sum += i;
			}
			else if (i % 5 == 0)
			{
				sum += i;
			}
		}
		System.out.println("Sum: " + sum);
	}
}
