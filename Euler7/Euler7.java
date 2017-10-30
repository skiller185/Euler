//Anthony Carpenetti
//When executed, Euler7...

public class Euler7
{
	public static void main(String[] args)
	{
		int lastPrime = 3;
		for(int i = 1;i < 10001;i++)
		{
			
		}
	}
	
	public static boolean isPrime(int n) //returns if n is prime
	{
		if(n <= 1)
		{
			return false;
		}
		else
		{
			for(int i = 2;i < n;i++)
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