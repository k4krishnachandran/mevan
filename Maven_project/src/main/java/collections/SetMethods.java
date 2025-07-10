package collections;

import java.util.Set;
import java.util.TreeSet;

public class SetMethods {

	public static void main(String[] args) 
	{
		Set<String> color= new TreeSet<String>();
		Set<String> fruits= new TreeSet<String>();
		color.add("red");
		color.add("yellow");
		color.add("green");
		
		fruits.add("apple");
		fruits.add("orange");
		fruits.add("watemelon");
		System.out.println(fruits);
		System.out.println(color);
		
		
		//method 1 addAll()
		color.addAll(fruits);
		System.out.println(fruits);
		System.out.println(color);
		
		//method 2 remove()
		color.remove("red");
		fruits.remove("apple");
		System.out.println(fruits);
		System.out.println(color);
		
		//method 3 removeAll()
		color.removeAll(fruits);
		System.out.println(color);
		
		//method 4 clear()
		color.clear();
		System.out.println(color);
	}
	

}
