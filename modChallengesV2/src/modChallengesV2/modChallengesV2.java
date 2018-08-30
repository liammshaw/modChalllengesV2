package modChallengesV2;
import java.util.Scanner;
public class modChallengesV2
	{

		public static void main(String[] args)
			{
				showModChallengeOne();
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
				else {
					System.out.println("It's not a leap year!");
				}
			}
	}
