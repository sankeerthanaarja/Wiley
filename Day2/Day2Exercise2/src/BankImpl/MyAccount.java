package BankImpl;

public class MyAccount {
	public static void main(String[] args) {
SavingsAcc savaccount=new SavingsAcc();
FDAcc fdaccount=new FDAcc();
PersonalLoanAcc placcount= new PersonalLoanAcc();
HousingLoanAcc houseloanaccount=new HousingLoanAcc();
savaccount.addMonthlyInt();
fdaccount.withdraw();
placcount.deductMonthlyInt();
houseloanaccount.repayPrincipal();
}
}
