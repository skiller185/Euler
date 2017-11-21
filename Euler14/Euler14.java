// Anthony Carpenetti
// When executed, Euler14 finds the longest chain length of all hailstone sequences with seeds less than 1'000'000

public class Euler14
{
	public static void main(String[] args)
	{
		int maxChainLength = 0;
		int maxChainSeed = 0;
		for(int i = 1;i < 1000000;i++)
		{
			int chainLength = 1;
			long n = i;
			while(n != 1)
			{
				n = nextCollatz(n);
				chainLength++;
			}
			
			if(maxChainLength < chainLength)
			{
				maxChainLength = chainLength;
				maxChainSeed = i;
			}
		}
		System.out.println(maxChainSeed);
	}
	
	public static long nextCollatz(long n)
	{
		if(n % 2 == 0)
		{
			return n / 2;
		}
		else
		{
			return 3 * n + 1;
		}
	}
}