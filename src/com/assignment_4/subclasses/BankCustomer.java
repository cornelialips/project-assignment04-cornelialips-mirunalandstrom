package com.assignment_4.subclasses;

/***
 * @author cornelia, Miruna
 * @version 1.0
 */
import java.util.ArrayList;

import com.assignment_4.superclasses.BankAccount;
import com.assignment_4.superclasses.Human;

/***
 * 
 * This is a subclass to the class Human. It has one attribute, which is an
 * ArrayList
 *
 */
public class BankCustomer extends Human {
	ArrayList<BankAccount> customerAccounts = new ArrayList<BankAccount>();

	/***
	 * This is the constructor with two parameters
	 * 
	 * @param name
	 * @param age
	 */
	public BankCustomer(String name, int age) {
		super(name, age);

	}

	/**
	 * Here we have our getters and setters
	 * 
	 * @return CustomerAccounts
	 */
	public ArrayList<BankAccount> getCustomerAccounts() {
		return customerAccounts;
	}

	public void setCustomerAccounts(ArrayList<BankAccount> customerAccounts) {
		this.customerAccounts = customerAccounts;
	}

	/***
	 * This is method number 1, where we add an account
	 * 
	 * @param bankAccount
	 */
	public void addAccount(BankAccount bankAccount) {
		customerAccounts.add(bankAccount);
	}

	/**
	 * This is mehtod number 2, where we deposit an amount to an accountNumber
	 * 
	 * @param accountNumber
	 * @param amount
	 */
	public void depositToAccount(String accountNumber, double amount) {
		for (int i = 0; i < customerAccounts.size(); i++) {
			if (customerAccounts.get(i).getAccountNumber().equals(accountNumber)) {
				customerAccounts.get(i).depositMoney(amount);
			}
		}
	}

	/***
	 * This is method number 3, where we withdraw money from an accountnumber
	 * @param accountNumber
	 * @param amount
	 */
	public void withdrawFromAccount(String accountNumber, double amount) {
		for (int i = 0; i < customerAccounts.size(); i++) {
			if (customerAccounts.get(i).getAccountNumber().equals(accountNumber)) {
				customerAccounts.get(i).withdrawMoney(amount);
			}
		}
	}

	/**
	 * This is method number 4, a toString where we print Name and Age of the
	 * customer, and information about his/her accounts
	 */

	public String toString() {
		System.out.println("Customer " + getName() + " Age:" + getAge());
		return "BankCustomer [customerAccounts=" + customerAccounts + "]";
	}

}
