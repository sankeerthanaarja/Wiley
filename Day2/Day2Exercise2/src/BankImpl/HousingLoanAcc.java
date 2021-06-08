package BankImpl;
import bank.*;
public class HousingLoanAcc implements LoanAcc,DebitInterest {

	public void deductMonthlyInt() {
		System.out.println("HousingLoanAcc  deductMonthlyInt");
		
	}

	public void deductHalfYrlyInt() {
		System.out.println("HousingLoanAcc deductHalfYrlyInt");
	}
	public void deductAnnualInt() {
		System.out.println("HousingLoanAcc deductAnnualInt");
	}


	public void repayPrincipal() {
		System.out.println("HousingLoanAcc repayPrincipal");
		
	}

	public void payInterest() {
		System.out.println("HousingLoanAcc  payInterest");
		
	}

	public void payPartialPrincipal() {
		
		System.out.println("HousingLoanAcc payPartialPrincipal");
	}

}
