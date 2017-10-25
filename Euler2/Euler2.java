//Anthony Carpenetti
//When executed, Euler2 prints the sum of all even fibonacci numbers less than 4000000

public class Euler2
{
   public static void main(String[] args)
   {
      int ans = 0;
      int a = 0;
      int b = 1;
      int c = 0;
      while(a < 4000000)
      {
         if(a % 2 == 0)
         {
            ans += a;
         }
         c = b;
         b += a;
         a = c;
      }
      System.out.println(ans);
   }
}