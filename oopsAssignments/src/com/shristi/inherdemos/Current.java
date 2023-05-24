package com.shristi.inherdemos;

public class Current extends Account{

	double balance=super.getBalance();
		public Current(double balance) {
			super(balance);
			// TODO Auto-generated constructor stub
		}

		@Override
		void withDraw(double amount) {
			System.out.println("you are withdrawing from current account");
			balance=balance-amount;
			super.balance=balance;
		}

		@Override
		void deposit(double amount) {
			System.out.println("You are depositing to current account");
			balance=balance+amount;
			super.balance=balance;
			
		}
		
	

}
