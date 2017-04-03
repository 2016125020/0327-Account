public class CheckingAccount extends Account {
	private double credit_limit;
	private double interest;
	private double loan_interest;
	
	public CheckingAccount(double a, double b, double c, double d){
		balance = a;
		credit_limit = b;
		interest = c;
		loan_interest = d;
	}
	
	public void debit(double a){
		if(a <= balance + credit_limit){
			balance = balance-a;
		}else{
			System.out.println("You can't withdraw money!");
		}
	}
	
	public double getWithdrawableAccount() {		
		if(balance < -(credit_limit)){
			withdrawal = 0;
		}else{
			withdrawal = balance + credit_limit;
		}
		
		return withdrawal;
	}

	public void passTime(int a) {
		if(balance < 0){
			balance = balance + balance * loan_interest*a;
		}else{
			balance = balance + balance * interest*a;
		}
	}
	
	public boolean isBankrupted(){
		if(balance < -(credit_limit)){
			return false;
		}else{
			return true;
		}
	}
	
	public double EstimateValue(int month){
		if(balance < 0){
			balance = balance + balance * loan_interest*month;
		}else{
			balance = balance + balance * interest*month;
		}
		return balance;
	}
	
	public String toString(){
		return String.format("CheckingAccount_Balance : %.2f", balance);
	}
}
