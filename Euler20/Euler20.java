// Anthony Carpenetti
// When executed, Euler20 prints the sum of the digits of 100! (factorial)

import java.math.BigInteger;

public class Euler20
{
	public static void main(String[] args)
	{
		int ans = 0;
		BigInteger hundred = new BigInteger("100");
		BigInteger hunFac = bigIntegerFactorial(hundred);
		String hunFacStr = hunFac.toString();
		for(int i = 0;i < hunFacStr.length();i++)
		{
			String curDigit = hunFacStr.substring(i, i + 1);
			int curDigitValue = Integer.parseInt(curDigit);
			ans += curDigitValue;
		}
		System.out.println(ans);
		
		// System.out.println(bigIntegerFactorial(BigInteger("100")).toString());
		
		/* long hunFac = longFactorial(100);
		String hunFacStr = Long.toString(hunFac);
		int ans = 0;
		for(int i = 0;i < hunFacStr.length();i++)
		{
			String curDigit = hunFacStr.substring(i, i + 1);
			int curDigitValue = Integer.parseInt(curDigit);
			ans += curDigitValue;
		}
		System.out.println(ans); */
	}
	
	public static BigInteger bigIntegerFactorial(BigInteger n)
	{
		if(n.toString().equals("0"))
		{
			return BigInteger.ONE;
		}
		else
		{
			return n.multiply(bigIntegerFactorial(n.subtract(BigInteger.ONE)));
		}
	}
}