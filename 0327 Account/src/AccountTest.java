import java.util.Scanner;

public class AccountTest{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		Account account1 = new checkingAccount(100, 50, 0.01, 0.07);	
		Account account2 = new SavingAccount(100, 0.05);
		//Checking Account	
		double amount;

		
		System.out.printf("Account1 balance : $ %.2f\t 현재 출금가능액 : %.2f\n", account1.getBalance(),account1.getWithdrawableAccount());
		System.out.println("Enter withdrawal amount for Account1: ");
		amount = scan.nextDouble();
		account1.debit(amount);
		System.out.printf("Account1 balance : $ %.2f\t 현재 출금가능액 : %.2f\n", account1.getBalance(),account1.getWithdrawableAccount());

		if((((checkingAccount)account1).isBankrupted())==false){
			System.out.println("account1 went Bankrupt!");
			
		}
		
		account1.passTime(1);
		System.out.printf("Account1 balance : $ %.2f\t 현재 출금가능액 : %.2f\n", account1.getBalance(),account1.getWithdrawableAccount());
		
		if((((checkingAccount)account1).isBankrupted())==false){
			System.out.println("account1 went Bankrupt!");
		}
		
		account1.passTime(5);
		System.out.printf("Account1 balance : $ %.2f\t 현재 출금가능액 : %.2f\n", account1.getBalance(),account1.getWithdrawableAccount());
		
		if((((checkingAccount)account1).isBankrupted())==false){
			System.out.println("account1 went Bankrupt!");
		}
		
		//SavingAccount
		
		System.out.println();
		System.out.printf("Account2 balance : $ %.2f \t 현재 출금가능ㅇ액 : %.2f\n", account2.getBalance(), account2.getWithdrawableAccount());
		
		System.out.println("6Month later!");
		account2.passTime(6);
		System.out.printf("Account2 balance : $ %.2f \t 현재 출금가능ㅇ액 : %.2f\n", account2.getBalance(), account2.getWithdrawableAccount());
		account2.debit(50);	
		
		System.out.println("next 6Month later!");	
		account2.passTime(6);
		System.out.printf("Account2 balance : $ %.2f \t 현재 출금가능ㅇ액 : %.2f\n", account2.getBalance(), account2.getWithdrawableAccount());
		
		System.out.println("next 1Month later!");	
		account2.passTime(1);
		System.out.printf("Account2 balance : $ %.2f \t 현재 출금가능ㅇ액 : %.2f\n", account2.getBalance(), account2.getWithdrawableAccount());
		account2.debit(50);	
		System.out.printf("Account2 balance : $ %.2f \t 현재 출금가능ㅇ액 : %.2f\n", account2.getBalance(), account2.getWithdrawableAccount());
		
	}
}