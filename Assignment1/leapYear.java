//8.Write a Java Program to find whether given number is Leap year or NOT? 

import java.util.*;
class leapYear 
{
	public static void main(String[] args)
	{
		int year;
		System.out.println("Enter an Year-");
		Scanner n = new Scanner(System.in);
		year = n.nextInt();

		if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))
		{
			System.out.println(year + " This year is a leap year");
        }
		else
        { 
			System.out.println(year + " This year is not a leap year");
		}
	}
}

