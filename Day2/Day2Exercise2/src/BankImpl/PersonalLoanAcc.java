package BankImpl;
import bank.*;
public class PersonalLoanAcc implements LoanAcc,DebitInterest{
	public void  repayPrincipal()
	{
		System.out.println("PersonalLoanAcc repayPrincipal");
	}
	public void payInterest()
	{
		System.out.println("PersonalLoanAcc payInterest");
	}
	public void payPartialPrincipal()
	{
		System.out.println("PersonalLoanAcc PayPartial");
	}
	public void deductMonthlyInt()
	{
		System.out.println("PersonalLoanAcc deductmontly");
	}
	public void deductHalfYrlyInt()
	{
		System.out.println("PersonalLoanAcc deduct");
	}
	public void deductAnnualInt()
	{
		System.out.println("PersonalLoanAcc deduct annual");
	}
}
