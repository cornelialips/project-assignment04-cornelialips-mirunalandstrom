package com.assignment_4.subclasses;
/***
 * @author cornelia,Miruna
 * @version 1.0
 * This is a subclass to BankAccount
 */
import java.util.UUID;

import com.assignment_4.superclasses.BankAccount;
	/**
	 * We have a constructor that takes no parameters
	 *
	 */
	public class PersonalAccount extends BankAccount {
		public PersonalAccount() {
			this.setAccountNumber(UUID.randomUUID().toString().substring(0,6));
			this.setBalance(0.0);
			this.setAccountType("Personal Account");
	}
}
	
