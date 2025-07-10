package inheritance;

public class HraAndPf extends Employee
{
	double hra;
	double pf;
	
public void calc()
{
	super.getInput();
	hra=0.05*basicPay;
	//System.out.println("hra is"+hra);
	pf=0.2*basicPay;
}
}
