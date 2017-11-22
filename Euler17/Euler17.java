// Anthony Carpenetti
// When executed, Euler17 finds the number of letters in the all the word forms of the numbers between one and one thousand inclusive

public class Euler17
{
	public static void main(String[] args)
	{
		String space = " ";
		String and = "and";
		String dash = "-";
		String one = "one";
		String two = "two";
		String three = "three";
		String four = "four";
		String five = "five";
		String six = "six";
		String seven = "seven";
		String eight = "eight";
		String nine = "nine";
		String ten = "ten";
		String eleven = "eleven";
		String twelve = "twelve";
		String thirteen = "thirteen";
		String fourteen = "fourteen";
		String fifteen = "fifteen";
		String sixteen = "sixteen";
		String seventeen = "seventeen";
		String eighteen = "eighteen";
		String nineteen = "nineteen";
		String twenty = "twenty";
		String thirty = "thirty";
		String forty = "forty";
		String fifty = "fifty";
		String sixty = "sixty";
		String seventy = "seventy";
		String eighty = "eighty";
		String ninety = "ninety";
		String hundred = "hundred";
		
		int ans = 0;
		
		for(int i = 1000;i > 0;i--)
		{
			String curNum = "";
			int temp = i;
			int hundreds = temp / 100;
			if(hundreds != 0)
			{
				switch(hundreds)
				{
					case 10:
						curNum = "one thousand";
						break;
					case 9:
						curNum += nine;
						break;
					case 8:
						curNum += eight;
						break;
					case 7:
						curNum += seven;
						break;
					case 6:
						curNum += six;
						break;
					case 5:
						curNum += five;
						break;
					case 4:
						curNum += four;
						break;
					case 3:
						curNum += three;
						break;
					case 2:
						curNum += two;
						break;
					case 1:
						curNum += one;
						break;
				}
				
				if(hundreds != 10)
				{
					curNum += space + hundred + space;
				}
				temp -= hundreds * 100;
				if(temp != 0)
				{
					curNum += and + space;
				}
			}
			int tens = temp / 10;
			int ones = temp - (tens * 10);
			if(tens != 1)
			{
				switch(tens)
				{
					case 9:
						curNum += ninety;
						break;
					case 8:
						curNum += eighty;
						break;
					case 7:
						curNum += seventy;
						break;
					case 6:
						curNum += sixty;
						break;
					case 5:
						curNum += fifty;
						break;
					case 4:
						curNum += forty;
						break;
					case 3:
						curNum += thirty;
						break;
					case 2:
						curNum += twenty;
						break;
				}
				if(ones != 0 && tens != 0)
				{
					curNum += dash;
				}
			}
			else
			{
				switch(ones)
				{
					case 9:
						curNum += nineteen;
						break;
					case 8:
						curNum += eighteen;
						break;
					case 7:
						curNum += seventeen;
						break;
					case 6:
						curNum += sixteen;
						break;
					case 5:
						curNum += fifteen;
						break;
					case 4:
						curNum += fourteen;
						break;
					case 3:
						curNum += thirteen;
						break;
					case 2:
						curNum += twelve;
						break;
					case 1:
						curNum += eleven;
						break;
					case 0:
						curNum += ten;
						break;
				}
			}
			
			if(ones != 0 && tens != 1)
			{
				switch(ones)
				{
					case 9:
						curNum += nine;
						break;
					case 8:
						curNum += eight;
						break;
					case 7:
						curNum += seven;
						break;
					case 6:
						curNum += six;
						break;
					case 5:
						curNum += five;
						break;
					case 4:
						curNum += four;
						break;
					case 3:
						curNum += three;
						break;
					case 2:
						curNum += two;
						break;
					case 1:
						curNum += one;
						break;
				}
			}
			ans += countLetters(curNum);
		}
		System.out.println(ans);
	}
	
	public static int countLetters(String number)
	{
		int len = number.length();
		int sum = 0;
		for(int i = 0;i < len;i++)
		{
			if(number.charAt(i) != ' ' && number.charAt(i) != '-')
			{
				sum++;
			}
		}
		return sum;
	}
}
