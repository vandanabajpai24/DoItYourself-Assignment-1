//15.Write a java program to Reverse a given number.
import java.util.*;

class reverse
{
	public static void main(String args[])
	{
		Scanner n= new Scanner(System.in);     
		System.out.println("Enter a number- ");  
		int number = n.nextInt();
		int temp;
		int rev=0;
		while(number>0)
		{
			temp = number%10;
			rev= rev*10 + temp;
			number = number/10;

		}
		System.out.println(rev);
			
	}
}
