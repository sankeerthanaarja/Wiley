package bank;

public interface DepositAcc {
public void withdraw();
public void deposit();
public void getBalance();
}
/*
3.	<Interface>LoanAcc
Methods:  repayPrincipal (),payInterest (),payPartialPrincipal ()

4.	<Interface>Interest
Data members:  Four double variables to hold the interest percentage of Savings account, Fixed
deposit account,PersonalLoan account and HousingLoan account.
Methods:  calcInt()

5.	<Interface>CreditInterest
Methods:  addMonthlyInt(),addHalfYrlyInt(),addAnnualInt()

6.	<Interface>DebitInterest
Methods:  deductMonthlyInt(),deductHalfYrlyInt(),deductAnnualInt()
*/