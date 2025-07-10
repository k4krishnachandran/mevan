package inheritance;

public class MultiLevelC extends MultiLevelP2
{

	public static void main(String[] args) 
	{
		MultiLevelC obj=new MultiLevelC();
		obj.sum(50, 40);
		obj.sub(25, 10);
		obj.div();
	}
	public void div()
	{
		int a=20;
		int b=4;
		int c=a/b;
		System.out.println("Divided value "+c);
		
	}
}
