package euler;

/**
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, 
 * we can see that the 6th prime is 13.
 * 
 * What is the 10 001st prime number?
 * 
 * Answer: 104743
 * 
 * @author gambitgeoff
 *
 */
public class Problem0007 
{
	public static void main(String [] args)
	{
		int currentPrime = 1;
		for (int i=1;i<10002;i++)
		{
			currentPrime = getNextPrime(currentPrime);
		}
		System.out.println("10,001'th Prime: " + currentPrime);
	}
	
	public static int getNextPrime(int inCurrentPrime)
	{
		boolean prime = true;
		for (int i=(inCurrentPrime+1);i<Integer.MAX_VALUE;i++)
		{
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					prime = false;
					break;
				}
			}
			if(prime)
				return i;
			prime=true;
		}
		return -1;
	}
}
