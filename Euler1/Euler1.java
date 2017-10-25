//Anthony Carpenetti
//When executed, Euler1 prints the sum of all numbers divisible by 3 or 5 less than 1000

public class Euler1
{
	public static void main(String[] args)
	{
      int ans = 0;
		for(int i = 1;i < 1000;i++)
      {
         if(i % 3 == 0 || i % 5 == 0)
         {
            ans += i;
         }
      }
      System.out.println(ans);
	}
}