//19.Check whether the Given Number is a Palindrome or NOT.
import java.util.*;

class pallindrome
{
	public static void main(String args[])
	{
		Scanner n= new Scanner(System.in);     
		System.out.println("Enter a number- ");  
		int number = n.nextInt();
		int temp;
		int original=number;
		int rev=0;
		while(number>0)
		{
			temp = number%10;
			rev= rev*10 + temp;
			number = number/10;

		}
		if(original==rev)
		{
			System.out.println("Pallindrome Number");
		}
		else
		{
			System.out.println("Not a Pallindrome Number");
		}
	}
}
