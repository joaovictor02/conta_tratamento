package model.entities;

import model.exceptions.DomainException;

public class Account {

	private Integer number;
	private String holder;
	private Double balance;
	private Double withdrawLimit;

	public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}

	public Integer getNumber() {
		return number;
	}

	public String getHolder() {
		return holder;
	}

	public Double getBalance() {
		return balance;
	}

	public Double getWithdrawLimit() {
		return withdrawLimit;
	}
	
	public void deposit(Double amount) {
		balance += amount;
	}
	
	public void withdraw(Double amount) {
		if(balance == 0) {
			throw new DomainException("Não se pode sacar se o saudo for zero");
		}
		if(amount>withdrawLimit) {
			throw new DomainException("Não se pode sacar um valor maior que o limite");
		}
		balance -= amount;
	}
	

}
