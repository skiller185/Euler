// Anthony Carpenetti
// When executed, Euler21 calculates the sum of all amicable numbers between 1 and 10000

public class Euler21
{
	public static void main(String[] args)
	{
		int ans = 0;
		for(int i = 1;i < 10001;i++)
		{
			if(isAmicable(i))
			{
				ans += i;
			}
		}
		System.out.println(ans);
	}
	
	public static boolean isAmicable(int n)
	{
		if(n == divisorSum(n))
			return false;
		else if(n == divisorSum(divisorSum(n)))
			return true;
		else
			return false;
	}
	
	public static int divisorSum(int n)
	{
		int sum = 0;
		for(int i = 1;i < n;i++)
		{
			if(n % i == 0)
			{
				sum += i;
			}
		}
		return sum;
	}
}