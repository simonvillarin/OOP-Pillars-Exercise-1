package org.ssglobal.training.codes.three;

public class Main {
	public static void main(String[] args) {
		BankAccount accountA = new BankAccount();
		BankAccount accountB = new BankAccount();
		accountA.setBalance(1000);
		accountB.setBalance(2000);
		
		Teller teller = new Teller();
        teller.transfer(accountA, accountB, 500);
	}
}
