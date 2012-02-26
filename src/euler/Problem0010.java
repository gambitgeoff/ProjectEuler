package euler;

/**
 * 
 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17. 
 * Find the sum of all the primes below two million.
 * 
 * Reference: Sieve of Eratosthenes
 * Reference: http://en.wikipedia.org/wiki/Sieve_of_Eratosthenes
 * 
 * Answer: 142913828922
 * 
 * @author gambitgeoff
 *
 */
public class Problem0010 
{
	public static long myLimit = 2000000L;
	public static byte [] myPrimes;
	public static void main(String [] args)
	{
		myPrimes = new byte[2000000];
		initialisePrimes();
		myPrimes[1] = 1;
		long sumPrimes = 0;
		for (int i=2;i<myPrimes.length;i++)
		{
			if (isPrime(i))
			{
				sumPrimes += i;
				flagMultiples(i);
				continue;
			}
		}
		System.out.println("Sum of primes < " + myLimit + ": " + sumPrimes);
	}
	
	public static void initialisePrimes()
	{
		for (int i=0;i<myPrimes.length;i++)
		{
			myPrimes[i] = 1;
		}
	}
	
	public static void flagMultiples(int inPrime)
	{
		long amount = inPrime;
		for (long multiplier=inPrime;amount<myLimit;multiplier++)
		{
			amount = multiplier * inPrime;
			if(amount < myLimit)
				myPrimes[(int)amount] = 0;
		}
	}
	
	public static boolean isPrime(int inPrime)
	{
		if (myPrimes[inPrime]==1)
			return true;
		for (int i=2;i<inPrime;i++)
		{
			if (inPrime%i==0)
				return false;
		}
		return true;
	}
}
