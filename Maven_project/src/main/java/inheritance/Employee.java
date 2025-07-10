package inheritance;

import java.util.Scanner;

public class Employee 
{
	double basicPay;
	double deduction;
	double bonus;
	String name;
	
	
	public void getInput()
	{
		Scanner sc=new Scanner(System.in);// to take input via keyboard
		System.out.println("Enter basic pay");
		basicPay=sc.nextDouble();
		System.out.print("Enter deduction");
		deduction=sc.nextDouble();
		System.out.println("Enter bonus");
		bonus=sc.nextDouble();
		System.out.println("name :");
		name=sc.next();
	}
}
