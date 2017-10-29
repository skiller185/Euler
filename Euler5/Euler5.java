//Anthony Carpenetti
//When executed, Euler5 finds and prints the least common multiple of the numbers [1, 20]
//unsure of output due to memory constraints
//java.lang.OutOfMemoryError: Java heap space
import java.util.ArrayList;

public class Euler5
{
	public static void main(String[] args) throws IllegalArgumentException
	{
		ArrayList<Integer> foo = new ArrayList<Integer>(0);
		int sizeFoo = foo.size();
		int product = 1;
		for(int i = 2;i < 21;i++)
		{
			int n = i;
			ArrayList<Integer> bar = new ArrayList<Integer>(0);
			while(n != 1)
			{
				int[] lpf = leastPrimeFactor(n);
				n = lpf[0];
				bar.add(new Integer(lpf[1]));
			}

			for(int j = 2;j < 21;j++)
			{
				int amtOfElemFoo = 0;
				int amtOfElemBar = 0;
				sizeFoo = foo.size();
				int sizeBar = bar.size();
				for(int k = 0;k < sizeFoo;k++)
				{
					if(j == foo.get(k).intValue())
					{
						amtOfElemFoo++;
					}
				}

				for(int k = 0;k < sizeBar;k++)
				{
					if(j == bar.get(k).intValue())
					{
						amtOfElemBar++;
					}
				}

				while(amtOfElemBar > amtOfElemFoo)
				{
					foo.add(new Integer(j));
				}
			}
		}
		sizeFoo = foo.size();

		for(int i = 0;i < sizeFoo;i++)
		{
			product *= foo.remove(0).intValue();
		}
		System.out.println(product);
	}

	public static int[] leastPrimeFactor(int n) throws IllegalArgumentException //returns an int[] length 2 where: (A[0] == n / p && A[1] == p)
	{
		if(n <= 0)
		{
			throw new IllegalArgumentException("NEITHER NEGATIVE NUMBERS NOR ZERO HAVE PRIME FACTORS");
		}
		else if(n == 1)
		{
			return new int[]{1, 1};
		}
		else
		{
			for(int i = 2;i <= n;i++)
			{
				if(n % i == 0)
				{
					return new int[]{n / i, i};
				}
			}
		}
		return new int[]{-1, -1};
	}
}
