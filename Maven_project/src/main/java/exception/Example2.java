package exception;

public class Example2 {

	public static void main(String[] args) 
	{
		
		Example2 obj=new Example2();
		obj.license(2);
	}
	public void license(int age)throws ArithmeticException
	{
		if(age>=18)
		{
			throw new ArithmeticException("Eligible");// declaring that there is an exception.So while running the program when if condition becomes true,exception will show along with the printing statement
		}
		else
		{
			System.out.println("Not Eligible");
		}
	}

}
