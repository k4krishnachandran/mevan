package interfaceKeyword;

public class interfaceChild implements InterfaceParent
{
	public void sum()
	{
		System.out.println("sum is");
	}
	public void name()
	{
		System.out.println("Name");
	}
	public void display()
	{
		System.out.println("test");
	}
	public static void main(String[] args) 
	{
		interfaceChild obj=new interfaceChild();
		obj.sum();
		obj.name();
		obj.display();

	}

}
