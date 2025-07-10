package encapsulation;

public class EncapsP 
{
	private int a;//to ensure high security we use private key word
	public void set(int a)
	{
		this.a=a;
		
	}
	public void get()
	{
		System.out.println("value is "+a);
	}
	public void sum(int p,int q)
	{
		int r=p+q;
		System.out.println("sum is "+r);
	}
	
}
