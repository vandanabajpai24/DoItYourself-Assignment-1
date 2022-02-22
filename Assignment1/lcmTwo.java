//17.Write a java program to LCM of TWO given number. 
import java.util.*;
class lcmTwo
{
	public static void main(String args[])
	{
		int i, number;
		Scanner n= new Scanner(System.in);     
		System.out.println("Enter 1st number- ");  
		int number1 = n.nextInt();
		System.out.println("Enter 2nd number- ");  
		int number2 = n.nextInt();
		if(number1>number2)
		{
			number=number2;
		}
		else
		{
			number=number1;
		}
		
		for(i=1;i<=number;i++)	
		{
			if(number1%i==0 && number2%i==0)
			{
				System.out.println(i);
			}

		}		
	}
}
