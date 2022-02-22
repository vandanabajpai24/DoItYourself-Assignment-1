//5.Swap two numbers without using third variable approach 2.
import java.util.*;

class swap2
{
	public static void main(String args[])
	{
		Scanner n= new Scanner(System.in);     
		System.out.println("Enter first number- ");  
		int number1 = n.nextInt();

		System.out.println("Enter second number- ");  
		int number2 = n.nextInt();
		System.out.println("Before Swap");				
		System.out.println("First number is "+ number1 + " and "+ " Second number is " + number2);
		number1 = number1 + number2;
		number2 = number1 - number2;
		number1 = number1 - number2;
		System.out.println("After Swap");				
		System.out.println("First number is "+ number1 + " and "+ " Second number is " + number2);				
		
	}
}
