public class SavingAccount extends Account {
	private double interest;
	private int month;
	
	public SavingAccount(double a, double b){
		balance = a;
		interest = b;
		month = 0;
		withdrawal = balance;
	}
	
	public void debit(double a){
		if(month < 12){
			System.out.println("아직 출금할 수 없습니다!");
		}else{
			balance = balance - a;
		}
	}

	public double getWithdrawableAccount() {
		if(month < 12){
			withdrawal = 0;
		}else{
			withdrawal = balance;
		}
		
		return withdrawal;
	}

	public void passTime(int a) {
		month = month + a;
		
		if(month == 12){
			balance = balance * Math.pow((1+interest), month);
		}
	}
	
	public double EstimateValue(int month){
		balance = balance * Math.pow((1+interest), month);

		return balance;
	}
	
	public String toString(){
		return String.format("SavingAccount_Balance : %.2f", balance);
	}
}
