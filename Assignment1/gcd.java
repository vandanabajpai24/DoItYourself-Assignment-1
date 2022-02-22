//16.Write a Java Program to find GCD of two given numbers. 
import java.util.*;
class gcd 
{  
	public static void main(String[] args)   
	{ 
		Scanner n= new Scanner(System.in);     
		System.out.println("Enter 1st number- ");  
		int number1 = n.nextInt();
		System.out.println("Enter 2nd number- ");  
		int number2 = n.nextInt();
		int gcd = 1;  
		int i;
		for(i = 1; i <= number1 && i <= number2; i++)  
		{  
			if(number1%i==0 && number2%i==0)  
			gcd = i;  
		}  
		System.out.printf("GCD of " + number1 + " and " + number2 + " is " + gcd);  
	}  
}  