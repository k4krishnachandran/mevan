package encapsulation;

public class EcapsC {

	public static void main(String[] args) 
	{
		EncapsP obj=new EncapsP();
		obj.set(10);
		obj.sum(60, 30);
		obj.get();
		
	}
	//ENCAPSULATION KEYPOINT
	//only the methods defined in the parent class can be called in child class. No objects can be created for child class
	
	
	/*public void sub(int x,int y)
	{
		int z =x-y;
		System.out.println("difference is "+z);
	}*/

}
