//7.How to check the given number is Positive or Negative in Java? 
import java.util.*;
class num
{
	public static void main(String args[])
	{
		System.out.println("Enter a number- "); 
        Scanner n= new Scanner(System.in);		
		int number = n.nextInt();
		if( number == 0 )
		{
			System.out.println("Number is neither Positive nor Negative");  
		}
		else if (number > 0)
		{
			System.out.println("Number is Positive");
		}
		else
		{
			System.out.println("Number is Negative");
		}
	}
}
