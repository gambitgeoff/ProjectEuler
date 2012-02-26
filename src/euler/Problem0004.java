package euler;

/**
 * 
 * A palindromic number reads the same both ways. The 
 * largest palindrome made from the product of two 
 * 2-digit numbers is 9009 = 91 99.
 * 
 * Find the largest palindrome made from the product
 * of two 3-digit numbers.
 * 
 * Answer: 906609
 * 
 * @author gambitgeoff
 *
 */
public class Problem0004 
{
	public static void main(String [] args)
	{
		int largestPalendrome = 0;
		for (int i=999;i>0;i--)
		{
			for (int j=999;j>0;j--)
			{
				if (isPalendrome(i*j))
				{
					if (i*j>largestPalendrome)
					{
						largestPalendrome=i*j;
					}
				}
			}
		}
		System.out.println("Largest Palendrome: " + largestPalendrome);
	}
	
	public static boolean isPalendrome(int inNumber)
	{
		String number = ""+inNumber;
		while (number.length()>1)
		{
			if (number.charAt(0) != number.charAt(number.length()-1))
				return false;
			number = number.substring(1, number.length()-1);
		}
		return true;
	}
}
