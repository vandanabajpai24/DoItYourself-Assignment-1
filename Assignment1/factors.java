//11.Write a Java Program to print all the Factors of the Given number.
import java.util.*;

class factors
{
	public static void main(String args[])
	{
		int i;
		Scanner n= new Scanner(System.in);     
		System.out.println("Enter a number- ");  
		int number = n.nextInt();
		for(i=1;i<=number;i++)	
		{
			if(number%i==0)
			{
				System.out.println(i);
			}

		}
	
		
	}
}
