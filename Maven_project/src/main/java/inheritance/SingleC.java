package inheritance;

public class SingleC extends SingleP
{

	public static void main(String[] args)
	{
		SingleC obj=new SingleC();
		obj.display();
		obj.print();

	}
	
	public void print()
	{
		System.out.println("printing");
	}

}
