package superKeyword;

public class VariableC extends VariableP
{
	int b=30;
	public static void main(String[] args)
	{
		VariableC obj=new VariableC();
		obj.sum();
		
	}
public void sum()
{
	System.out.println(super.a);
	System.out.println(b);
}
}
