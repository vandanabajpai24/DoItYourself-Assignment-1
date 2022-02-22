//10.Write a Java Program to print the digits of a Given Number.
import java.util.*;

class digits
{
	public static void main(String args[])
	{
		Scanner n= new Scanner(System.in);     
		System.out.println("Enter a number- ");  
		int number = n.nextInt();
		int temp;
		while(number>0)
		{
			temp= number%10;
			number = number/10;
			System.out.println(temp);

		}
	
		
	}
}
