package poo.bank;

public class Bank {

	private int accountNumber;	
	private String holder;
	private double balance;
	public char response;
	public  int withdrawTax = 5;

	public Bank(int accountNumber, String holder) {
		this.accountNumber = accountNumber;
		this.holder = holder;
	}
	
	public Bank(int accountNumber, String holder, double initialDeposit) {
		this.accountNumber = accountNumber;
		this.holder = holder;
		deposit(initialDeposit);
	}
	
	public int getAccountNumber() {
		return accountNumber;
	}
	
	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getBalance() {
		return balance;
	}
	
	public void deposit(double ammount) {
		balance += ammount;
	}
	
	public void withdraw(double ammount) {
		balance -= ammount + withdrawTax;
	}

	public String toString() {

		return "Account "
				+ getAccountNumber()
				+ ", Holder: "
				+ getHolder()
				+ ", Balance: $ "
				+ String.format("%.2f", getBalance()) ;
	}
}
