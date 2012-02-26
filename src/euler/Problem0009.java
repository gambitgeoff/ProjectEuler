package euler;

/**
 * When m and n are any two positive integers (m < n):
 * a = n^2 - m^2
 * b = 2nm
 * c = n^2 + m^2
 * Then, a, b, and c form a Pythagorean Triple.
 * 
 * Answer: 31875000   (a=375,b=200,c=425)
 * 
 * @author gambitgeoff
 *
 */
public class Problem0009 
{
	public static void main(String [] args)
	{
		for (int m=1;m<100;m++)
		{
			for (int n=2;n<100;n++)
			{
				if (m<n)
				{
					double a = Math.pow(n, 2) - Math.pow(m, 2);
					double b = 2*(n*m);
					double c = Math.pow(n, 2) + Math.pow(m, 2);
					double x = a + b + c;
					if ((a+b+c)==1000.0)
					{
						System.out.println("Triple is: " + a + ", " + b + ", " + c);
						System.out.println("Product of triple: " + (a*b*c));
					}
				}
			}
		}
	}
}
