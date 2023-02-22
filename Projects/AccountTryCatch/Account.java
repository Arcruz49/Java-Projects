package model.entities;

public class Account {
	private Integer number;
	private String holder;
	private double balance;
	private double withdrawLimit; 
	
	public Account() {
	}
	public Account(Integer number, String holder, double balance, double withdrawLimit){
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}
	
	public void setNumber(Integer number) {
		this.number = number;
	}
	public Integer getNumber() {
		return number;
	}
	public void setHolder(String holder) {
		this.holder = holder;
	}
	public String getHolder() {
		return holder;
	}
	public void setWithdrawLimit(double withdrawLimit) {
		this.withdrawLimit = withdrawLimit;
	}
	public double getWithdrawLimit() {
		return withdrawLimit;
	}
	public double getBalance() {
		return balance;
	}
	
	public void deposit(double amount) {
		balance = balance + amount;
	}
	public void withdraw(double amount) {
		
		if(getWithdrawLimit() < amount) {
			throw new DomainException("The amount exceeds withdraw limit");
		}
		
		if(getBalance() < amount) {
			throw new DomainException("Not enough balance");
		}

		balance = balance - amount;
	}
}
