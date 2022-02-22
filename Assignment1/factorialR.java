//3.Find the Factorial of a number using Recursion.
import java.util.*;
class factorialR
{
	static int factorial(int n)
	{
		if(n!=0)
			return n*factorial(n-1);
		else
			return 0;	
	}
	public static void main(String args[])
	{
		Scanner num= new Scanner(System.in);     
		System.out.print("Enter a number- ");  
		int number= num.nextInt();
		int result;
		result=factorial(number);
		
		System.out.println("Factorial of number "+ number + " is "+ result);				
	}
}
