package model.entities;

import model.exceptions.CaseException;

public class Account {
	
	private Integer number;
	private String holder;
	private Double balance; 
	private Double withDrawLimit;
	
	public Account(Integer number, String holder, double balance, double withDrawLimit) {
		
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withDrawLimit = withDrawLimit;
		
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public Double getWithDrawLimit() {
		return withDrawLimit;
	}
	
	public void deposit(Double ammount) {
		this.balance += ammount;
	}
	
	public void withDraw(Double ammount) throws Exception {
		
		if (this.balance < ammount) {
			throw new Exception("Not enough balance");
		}

		if (this.withDrawLimit < ammount) {
			throw new CaseException(" The amount exceeds withdraw limit");
		}
		
		this.balance -= ammount;
		
	}

}
