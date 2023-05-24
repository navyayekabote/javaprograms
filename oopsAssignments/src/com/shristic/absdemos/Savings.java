package com.shristic.absdemos;

public class Savings extends Bank{
	

		double balance=super.getBalance();
		public Savings(double balance) {
			super(balance);
			// TODO Auto-generated constructor stub
		}

		void withDraw(double amount) {
			System.out.println("you are withdrawing for savings account");
			balance=balance-amount;
			super.balance=balance;
		}

		@Override
		void deposit(double amount) {
			System.out.println("You are depositing to savings account");
			balance=balance+amount;
			super.balance=balance;
		}

}
