// Anthony Carpenetti
// When executed, Euler9 finds the Pythagorean triplet where a, b, and c sum to 1000

public class Euler9
{
	public static void main(String[] args)
	{
		boolean notFound = true;
		for(int a = 1;notFound && a < 1001;a++)
		{
			for(int b = 1;notFound && b < 1001;b++)
			{
				for(int c = 1;notFound && c < 1001;c++)
				{
					if(a + b + c == 1000 && (a * a) + (b * b) == (c * c))
					{
						System.out.println(a * b * c);
						notFound = false;
					}
				}
			}
		}
	}
}
