package abstraction;

public class AbstractChild extends AbstractP 
{
public void sum()
{
	int a=10,b=25;
	int c=a+b;
	System.out.println("value of c: "+c);
}
public void diff(int p,int r)
{
	int q=r-p;
	System.out.println("value of q is: "+q);
}
	public static void main(String[] args) 
	{
		//AbstractChild obj=new AbstractChild();
		AbstractP obj=new AbstractChild();
		obj.sum();
		obj.diff(45,5);
		obj.display();
		
	}

}
