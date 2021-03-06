package euler;

/**
 * 
 * The sequence of triangle numbers is generated by adding the natural numbers. 
 * So the 7th triangle number would be 1 + 2 + 3 + 4 + 5 + 6 + 7 = 28. The 
 * first ten terms would be:
 * 
 * 1, 3, 6, 10, 15, 21, 28, 36, 45, 55, ...
 * 
 * Let us list the factors of the first seven triangle numbers:
 * 
 * 1: 1
 * 3: 1,3
 * 6: 1,2,3,6
 * 10: 1,2,5,10
 * 15: 1,3,5,15
 * 21: 1,3,7,21
 * 28: 1,2,4,7,14,28
 * 
 * We can see that 28 is the first triangle number to have over five divisors.
 * 
 * What is the value of the first triangle number to have over five hundred divisors?
 * 
 * Answer:
 * 
 * Triangle number: 76576500 has: 576 divisors
 * 
 * @author geoffrey
 *
 */
public class Problem0012 
{
	public static void main(String [] args)
	{
		int numDivisors=0;
		int triangleNumber = 0;
		int count=1;
		while(numDivisors<501)
		{
			triangleNumber = (count*(count+1))/2;
			numDivisors = getDivisors(triangleNumber);
			count++;
		}
		System.out.println("Triangle number: " + triangleNumber + " has: " + numDivisors + " divisors.");
	}
	
	public static int getDivisors(int inNumber)
	{
		int count=0;
		for (int i=1;i<inNumber+1;i++)
		{
			if (inNumber%i==0)
				count++;
		}
		return count;
	}

}
