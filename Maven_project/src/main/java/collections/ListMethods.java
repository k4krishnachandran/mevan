package collections;

import java.util.*;

public class ListMethods {

	public static void main(String[] args) 
	{
		//method1 add()
		List<String> fruits=new ArrayList<String>();
		fruits.add("apple");
		fruits.add("orange");
		fruits.add("watemelon");
		fruits.add("banana");
		System.out.println(fruits);
		
		//method2 get()
		System.out.println(fruits.get(0));
		
		//method 3 set()
		
		fruits.set(2, "grapes");
		System.out.println(fruits);
		
		//method 4 indexOf()
		
		fruits.add("apple");
		System.out.println(fruits);
		System.out.println(fruits.indexOf("apple"));
		
		
		//method 5 lastIndexof()
		System.out.println(fruits.lastIndexOf("apple"));
		
		
		//method 6 remove()
		fruits.remove(4);
		System.out.println(fruits);
		
		
		//method 7 contains()
		System.out.println(fruits.contains("banana"));
		
		//method 8 isEmplty()
		System.out.println(fruits.isEmpty());
		
		
		//method 9 size()
		System.out.println(fruits.size());
		
		
		
		
	}

}
