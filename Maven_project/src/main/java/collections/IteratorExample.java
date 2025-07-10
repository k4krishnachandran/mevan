package collections;

import java.util.Iterator;
import java.util.*;

//import javax.swing.text.html.HTMLDocument.Iterator;

public class IteratorExample {

	public static void main(String[] args) 
	{
		Set<String> color= new TreeSet<String>();
		color.add("red");
		color.add("yellow");
		color.add("green");
		System.out.println(color);
		
		Iterator<String> i=color.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		i.remove();//to remove last index element
		System.out.println(color);
		

	}

}
