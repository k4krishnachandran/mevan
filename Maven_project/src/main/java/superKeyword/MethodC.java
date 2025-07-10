package superKeyword;

public class MethodC extends MethodP  {

	public static void main(String[] args)
	{
		MethodC obj=new MethodC();
		obj.person();
	}
	public void person()
	{
		super.display();
		System.out.println("Hello");
		this.age();
	}
	public void age()
	{
		System.out.println("My age is 32");
	}
	

}
