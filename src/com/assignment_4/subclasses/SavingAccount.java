package com.assignment_4.subclasses;
import java.util.UUID;

import com.assignment_4.superclasses.BankAccount;
/**
 * 
 * @author cornelia
 *@version 1.0
 *This is a subclass to Bankaccount
 */
public class SavingAccount extends BankAccount {
	/**
	 * We have a constructor that takes no parameters
	 */
	public SavingAccount() {
		this.setAccountNumber(UUID.randomUUID().toString().substring(0, 6));
		this.setBalance(0.0);
		this.setAccountType  ("Saving Account");
	}
}
