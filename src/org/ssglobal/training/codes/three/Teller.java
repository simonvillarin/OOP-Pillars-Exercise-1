package org.ssglobal.training.codes.three;

public class Teller {
	public void transfer(BankAccount fromAccount, BankAccount toAccount, double amount) {
		fromAccount.withdraw(amount);
		toAccount.deposit(amount);
		System.out.println("Transfer of " + amount + " is successful");
	}
}
