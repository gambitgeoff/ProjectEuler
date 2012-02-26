package euler;

/**
 * The sum of the squares of the first ten natural numbers is,
 * 12 + 22 + ... + 102 = 385The square of the sum of the first
 * ten natural numbers is,(1 + 2 + ... + 10)2 = 552 = 3025
 * Hence the difference between the sum of the squares of the
 * first ten natural numbers and the square of the sum is
 * 3025 − 385 = 2640.
 * 
 * Find the difference between the sum of the squares of the
 * first one hundred natural numbers and the square of the sum.
 * 
 * Answer: 25164150
 * 
 * @author geoffrey
 *
 */
public class Problem0006 
{
	public static void main(String [] args)
	{
		long sumSquares = 0L;
		long squareSum = 0L;
		for (int i=1;i<101;i++)
		{
			sumSquares += Math.pow(i, 2);
			squareSum+=i;
		}
		squareSum= (long) Math.pow(squareSum,2);
		System.out.println("Difference = " + (squareSum-sumSquares));
	}
}
