//Anthony Carpenetti
//When executed, Euler7...

public class Euler7
{
	public static void main(String[] args)
	{
		System.out.println(2);
		System.out.println(3);
      int lastPrime = 3;
		for(int i = 1;i < 10001;i++) //from the 2nd to the 10'001st prime
		{
			int j = lastPrime;
			while(!isPrime(j))
			{
				j += 2;
			}
         lastPrime = j;
         System.out.println(lastPrime);
		}
      System.out.println("The 10'001st prime is " + lastPrime);
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
