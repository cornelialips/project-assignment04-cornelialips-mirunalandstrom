package com.assignment_4.superclasses;
/***
 * @author cornelia, Miruna
 *@version 1.0
 */
import java.util.UUID;

import com.assignment_4.interfaces.BankOperations;
/***
 * 
 *This is a superclass, where we implement the interface.
 * we create three attributes
 */
public class BankAccount implements BankOperations {
	private String accountNumber ="";
	private String accountType = "";
	private double balance = 0.0;
	
	/***
	 *  Here is the constructor, with no parameters
	 */
	public BankAccount() {
		
		this.accountNumber = UUID.randomUUID().toString().substring(0, 6);
		this.balance = 0;
		this.accountType ="Bank Account";
	}
	/***
	 * Here we have getters and setters for our attributes
	 */
	
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
/***
 * this is our method toString, it returns a string with information about a BankAccount
 */
	public String toString() {
		return "BankAccount [AccountNumber=" + accountNumber + ", AccountType=" + accountType + ", Balance=" + balance+ "]";
	}

	public void withdrawMoney(double amount) {
		if(amount >= 0) {
			setBalance(getBalance() - amount);
		}else {
			System.out.println("You can not withdrax a negative amount of money from the account!");
			
		}	
	}

	public void depositMoney(double amount) {
		if(amount >= 0) {
			setBalance(getBalance() + amount);
		}else {
			System.out.println("You can not deposit a negative value!");
		}
		
	}
	
}