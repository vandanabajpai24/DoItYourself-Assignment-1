//1.Check the given number is EVEN or ODD. 

import java.util.*;
class number
{
	public static void main(String args[])
	{
		Scanner n= new Scanner(System.in);     
		System.out.print("Enter a number- ");  
		int number= n.nextInt();
		if(number%2==0)
			System.out.println("Number is Even");
		else
			System.out.println("Number is Odd");				

	}
}

