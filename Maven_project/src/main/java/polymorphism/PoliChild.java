package polymorphism;

public class PoliChild extends PoliParent
{
	public void cal(int a,int b)
	{
		super.cal(10, 14);
		int c=a-b;
		System.out.println("difference is "+c);
	}
	public static void main(String[] args) 
	{
		PoliChild obj=new PoliChild();
		obj.cal(25, 15);
		obj.cal(35);
	}
	public void cal(int a)
	{
		System.out.println("overloading "+a);
	}

}
