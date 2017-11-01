//Anthony Carpenetti
//When executed, Euler7 calculates and prints the 10'001st prime.

public class Euler7
{
	public static void main(String[] args)
	{
      int lastPrime = 3;
		for(int i = 2;i < 10002;i++) //from the index i 2 to 10001
		{
         int j = lastPrime + 2;
         while(!isPrime(j))
         {
            j += 2;
         }
         lastPrime = j;
		}
      System.out.println(lastPrime);
	}
	
	public static boolean isPrime(int n) //returns true if n is prime; returns false if n is not prime
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
