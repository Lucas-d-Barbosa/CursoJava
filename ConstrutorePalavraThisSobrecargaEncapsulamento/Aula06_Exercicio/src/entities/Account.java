package entities;

public class Account {
	private int accountNumber;
	private String accountOwner;
	private double balance;
	
	public Account() {
	}
	
	public Account(int accountNumber, String accountOwner) {
		this.accountNumber = accountNumber;
		this.accountOwner = accountOwner;
	}

	public Account(int accountNumber, String accountOwner, double initialBalance) {
		this.accountNumber = accountNumber;
		this.accountOwner = accountOwner;
		deposit(initialBalance);
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public String getAccountOwner() {
		return accountOwner;
	}

	public void setAccountOwner(String accountOwner) {
		this.accountOwner = accountOwner;
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double value) {
		this.balance += value;
	}
	
	public void withdraw(double value) {
		this.balance -= value + 5;
	}
	
	
	public String toString() {
		return String.format(
				"Account %d, " +
				"Holder: %s, " +
				"Balance: $ %.2f%n",
				accountNumber,
				accountOwner, 
				balance
				);
	}
	
}
