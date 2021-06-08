package BankImpl;
import bank.*;
public class SavingsAcc implements DepositAcc,CreditInterest{

	@Override
	public void addMonthlyInt() {
		System.out.println("SavingsAcc addmonthly");
		
	}

	@Override
	public void addHalfYrlyInt() {
		System.out.println("SavingsAcc addHalf");
		
	}

	@Override
	public void addAnnualInt() {
		System.out.println("SavingsAcc  addAnnualInt ");
		
		
	}

	@Override
	public void withdraw() {
		System.out.println("SavingsAcc  withdraw");
		
	}

	@Override
	public void deposit() {
		System.out.println("SavingsAcc deposit");	
	}

	@Override
	public void getBalance() {
		System.out.println("SavingsAcc getBalance");
		
	}
	

}
