package modChallengesV2;
import java.util.Scanner;
public class modChallengesV2
	{

		public static void main(String[] args)
			{
				//showModChallengeOne();
				showFizzBuzz();
			}
		public static void showModChallengeOne()
			{
				Scanner userInput = new Scanner(System.in);
				System.out.println("please enter a year to find out if it's a leap year");
				int leapYear = userInput.nextInt();
				if ((leapYear % 4 == 0) &&! (leapYear % 100 == 0 && leapYear % 400 != 0))
					{
						System.out.println("It's a leap year!");
					}
				else 
					{
					System.out.println("It's not a leap year!");
					}
			}
		public static void showFizzBuzz()
			{
				for (int i = 1; i <= 100; i++)
					{
						if (i % 3 == 0 && i % 5 ==0 )
							{
								System.out.println("FizzBuzz");
							}
						else if (i % 5 == 0)
							{
								System.out.println("Buzz");
							}
						else if (i % 3 == 0)
							{
								System.out.println("Fizz");
							}
						else
							{
								System.out.println(i);
							}
					}
			}
	}
