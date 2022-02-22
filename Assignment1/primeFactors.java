//20.Write a Java Program to print all the Prime Factors of the Given Number.

import java.util.*;

public class primeFactors 
{
	public static void main(String args[]){
    int number;
    Scanner num = new Scanner(System.in);
    System.out.println("Enter a number-");
    number = num.nextInt();
    for(int i = 2; i<= number; i++) 
	{
        while(number%i == 0) 
		{
            System.out.println(i);
            number = number/i;
        }
    }
    if(number <1) 
	{
        System.out.println(number);
    }
   }
}