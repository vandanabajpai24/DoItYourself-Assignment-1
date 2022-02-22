//9.Write a Java Program to Print 1 To 10 Without Using Loop.
class withoutLoop
{
	public static void print(int n)
	{
		if(n<=10)
		{
			System.out.println(n);
		    print(n+1);
		}
		
    }
	public static void main(String args[])
	{
		print(1);
	}
}
	 
		
		