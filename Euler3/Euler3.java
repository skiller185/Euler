//Anthony Carpenetti
//When executed, Euler3 prints the greatest prime factor of 600851475143600851475143

public class Euler3
{
   public static void main(String[] args)
   {
      boolean notDone = true;
      long n = 600851475143L;
      while(notDone)
      {
         for(int i = 2;i < n;i++)
         {
            if(n % i == 0)
            {
               n /= i;
               break;
            }
            if(i == n - 1)
            {
               System.out.println(n);
               notDone = false;
            }
         }
      }
   }
}