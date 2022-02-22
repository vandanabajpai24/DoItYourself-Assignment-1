//2.Write a Java Program to find the Factorial of given number. 
import java.util.*;
class factorial
{
	public static void main(String args[])
	{
		Scanner n= new Scanner(System.in);     
		System.out.print("Enter a number- ");  
		int number= n.nextInt();
		int i, temp=1;
		for(i=1;i<=number;i++)
		{
			temp=i*temp;
		}
		System.out.println("Factorial of number "+ number + " is "+ temp);				

	}
}
