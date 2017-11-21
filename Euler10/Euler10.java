// Anthony Carpenetti
// When executed, Euler10...

public class Euler10
{
	public static void main(String[] args)
	{
		long ans = 0;
		for(int i = 0;i < 2000000;i++)
		{
			if(isPrime(i))
			{
				ans += i;
			}
		}
		System.out.println(ans);
	}
	
	public static boolean isPrime(int n)
	{
		if(n < 2)
		{
			return false;
		}
		else
		{
			if(n == 2)
			{
				return true;
			}
			else if(n % 2 == 0)
			{
				return false;
			}
			else
			{
				for(int i = 3;i < n;i += 2)
				{
					if(n % i == 0)
					{
						return false;
					}
				}
				return true;
			}
		}
	}
}
