package debugging;

public class DebugExample2 {

	public static void main(String[] args) 
	{
		DebugExample2 obj=new DebugExample2();
		obj.multi(3, 5);
	}
public void multi(int a, int b)
{
	int c=a*b;
	System.out.println(c);
}
}
