package exception;
import java.lang.ArithmeticException;

public class Example1 
{

	public static void main(String[] args)
	{
		try
		{
			int a=10,b=0;
			int c=a/b;
			System.out.println("value of c is "+c);
		}
	
		catch(ArithmeticException e)
		{
			System.out.println("zero cannot be divided ");
		}
		finally
		{
			int a=20,b=30;
			int c=a+b;
			System.out.println("sum is "+c);
		}
	}

}
