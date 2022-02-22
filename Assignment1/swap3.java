//6.Swap two numbers without using third variable approach 3.
import java.util.*;

class swap3
{
	public static void main(String args[])
	{
		Scanner n= new Scanner(System.in);     
		System.out.println("Enter first number- ");  
		int x = n.nextInt();

		System.out.println("Enter second number- ");  
		int y = n.nextInt();
		System.out.println("Before Swap");				
		System.out.println("First number is "+ x + " and "+ " Second number is " + y);
		x = x * y; 
        y = x / y; 
        x = x / y; 
		System.out.println("After Swap");				
		System.out.println("First number is "+ x + " and "+ " Second number is " + y);				
		
	}
}
