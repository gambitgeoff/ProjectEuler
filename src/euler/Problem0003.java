package euler;

/**
 * 
 * The prime factors of 13195 are 5, 7, 13 and 29.  
 * What is the largest prime factor of the number 600851475143 ?
 * 
 * Answer: 6857
 * 
 * @author gambitgeoff
 *
 */
public class Problem0003 
{
	/*
	 * The prime factor decomposition of a number is unique. 
	 * This is called the Fundamental Theorem of Arithmetic
	 * 
	 * This is just a shortcut so you don't need to go checking primes.
	 */
	public static void main(String [] args)
	{
		
		long n = 600851475143L;
		long i = 2L;
		while (i * i <= n)
		{
			if (n % i == 0)
				n /= i;
		    else
		        ++i;
		}
		System.out.println("Largest Prime Factor: " + n);
	}
}
