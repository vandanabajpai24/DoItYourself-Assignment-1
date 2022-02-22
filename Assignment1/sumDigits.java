//12.Write a Java Program to find sum of the digits of a given number.
import java.util.*;

class sumDigits
{
	public static void main(String args[])
	{
		Scanner n= new Scanner(System.in);     
		System.out.println("Enter a number- ");  
		int number = n.nextInt();
		int temp;
		int sum=0;
		while(number>0)
		{
			temp= number%10;
			number = number/10;
			sum= sum+temp;

		}
		System.out.println(sum);
			
	}
}
