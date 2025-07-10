package aggregation;

public class Student 
{
String name;
int age;
AddressP address;//aggregation
	public static void main(String[] args)
	{
		AddressP obj=new AddressP("Ernankulam","Kerala");
		Student obj1=new Student("QWERTY",23,obj);
		obj1.display();
	}
public Student(String name,int age,AddressP address)
{
	this.name=name;
	this.age=age;
	this.address=address;

}
public void display()
{
	System.out.println(name+" "+age+" "+address.city+" "+address.state );
}

}
