package BankImpl;
import bank.*;
public class FDAcc implements DepositAcc,CreditInterest{
	public void addMonthlyInt()
	{
		System.out.println("FDAcc  addMonthlyInt");
	}
	public void addHalfYrlyInt()
	{
		System.out.println("FDAcc addHalfYrlyInt");
	}
	public void addAnnualInt()
	{
		System.out.println(" FDAcc addAnnualInt");
	}
	public void withdraw()
	{
		System.out.println(" FDAcc withdraw");
	}
	public void deposit()
	{
		System.out.println(" FDAcc deposit");
	}
	public void getBalance()
	{
		System.out.println(" FDAcc getBlance");
	}
	
}
