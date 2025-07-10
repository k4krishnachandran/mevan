package inheritance;

public class HierarchC1 extends HierarchP
{
	public static void main(String[] args) 
	{
		HierarchC1 obj=new HierarchC1();
		obj.sum(40, 20);
		obj.sub(90, 40);
	}
	
	public void sub(int a, int b)
	{
		int c=a-b;
		System.out.println(c);
	}
}
