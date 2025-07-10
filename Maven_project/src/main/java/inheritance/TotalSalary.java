package inheritance;

public class TotalSalary extends HraAndPf
{
	double totSal;
	
public void totsal()
{
	totSal=basicPay+hra-pf-deduction+bonus;
}
public void salslip()
{
	System.out.println("Salary slip:");
	System.out.println("basicPay "+basicPay);
	System.out.println("deduction "+deduction);
	System.out.println("hra "+hra);
	System.out.println("pf "+pf);
	System.out.println("bonus "+bonus);
	System.out.println("totSal "+totSal);
	}
	public static void main(String[] args) 
	{
		TotalSalary obj=new TotalSalary();
		obj.calc();
		obj.totsal();
		obj.salslip();
	}

}
