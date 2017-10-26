//Anthony Carpenetti
//When executed, Euler4

public class Euler4
{
   public static void main(String[] args)
   {
      String foo;
      int curVal, iter, lastIndex, len, max;
      boolean even, palindrome;
      for(int i = 999;true;i++)
      {
         for(int j = 999;i > 99;i++)
         {
            curVal = i * j;
            foo = Integer.toString(curVal);
            len = foo.length();
            lastIndex = len - 1;
            iter = len;
            if(iter % 2 != 0)
            {
               iter--;
            }
            iter /= 2;
            
            for(int k = 0;k < iter;k++)
            {
               if(foo.charAt(k) == foo.charAt(lastIndex - k))
               {
                  palindrome = true;
               }
            }
            if(palindrome && )
            {
               
            }
         }
      }
   }
}