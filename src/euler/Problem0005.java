package euler;

/**
 * 2520 is the smallest number that can be divided by each
 * of the numbers from 1 to 10 without any remainder. What
 * is the smallest positive number that is evenly 
 * divisible by all of the numbers from 1 to 20?
 * 
 * Answer: 232792560
 * 
 * @author gambitgeoff
 *
 */
public class Problem0005 
{
	public static void main(String [] args)
	{
		boolean found = false;
		for (int i=20;i<Integer.MAX_VALUE;i++)
		{
			for (int j=1;j<21;j++)
			{
				if (i%j!=0)
				{
					found = false;
					break;
				}
				else
					found = true;
			}
			if (found)
			{
				System.out.println("smallest number is: " + i);
				System.exit(0);
			}
		}
	}
}
