//Anthony Carpenetti
//When executed, Euler4 calculates and prints the largest palindromic number created from 

public class Euler4
{
   public static void main(String[] args)
   {
      String foo;
      int curVal, iter, jAtMax = 99, lastIndex, len, max = 0;
      boolean even, palindrome = true;
      for(int i = 999;i > jAtMax;i--) //for the numbers from 999 to jAtMax...
      {
         for(int j = 999;j > 99;j--) //for the numbers 999 to 99...
         {
            palindrome = true; //palindrome is reset to true
            curVal = i * j; //set curVal to the product of the loop indices
            foo = Integer.toString(curVal); //set foo to a String representation of curVal
            len = foo.length(); //set len to the length of the String foo
            lastIndex = len - 1; //set lastIndex to the last possible index of the String foo
            iter = len; //set iter to len
            if(iter % 2 != 0) //if iter is odd
            {
               iter--; //decrement it
            }
            iter /= 2; //halve iter so it is the floor of half the length of the String foo
            
            for(int k = 0;k < iter;k++) //for half the characters in foo...
            {
               if(foo.charAt(k) != foo.charAt(lastIndex - k)) //if a character at index k doesnt match the character at index lastIndex - k
               {
                  palindrome = false; //set palindrome to false
                  break; //stop checking foo
               }
            }

            if(palindrome && curVal > max) //if palindrome is true and the current value is greater than the max
            {
               max = curVal; //the max becomes the current value
               jAtMax = j; //set jAtMax to the j value when max is set
               break; //break out of the j loop
            }
         }
      }
      System.out.println(max);
   }
}