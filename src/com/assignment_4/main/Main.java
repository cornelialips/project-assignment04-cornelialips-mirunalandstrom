package com.assignment_4.main;
/**
 * @author cornelia,Miruna
 * @version 1.0
 */
import com.assignment_4.subclasses.BankCustomer;
import com.assignment_4.subclasses.PersonalAccount;
import com.assignment_4.subclasses.SavingAccount;
import com.assignment_4.superclasses.BankAccount;


public class Main {
/***
 * This is our Main Method
 * @param args 
 */
	public static void main(String[] args) {
		String account = "";
	
	BankCustomer bc = new BankCustomer("Cornelia", 26);	
	bc.addAccount(new BankAccount());
	bc.addAccount(new PersonalAccount());
	bc.addAccount(new SavingAccount());
	System.out.println(bc.toString());
	
	account = bc.getCustomerAccounts().get(0).getAccountNumber();
	System.out.println("Depositing 30.0 to the first account");
	bc.depositToAccount(account, 30.0);
	System.out.println(bc.toString());
	
	System.out.println("Withdrawing 200.0 to the first account");
	account = bc.getCustomerAccounts().get(1).getAccountNumber();
	bc.withdrawFromAccount(account, 200.0);
	System.out.println(bc.toString());
	
	System.out.println("Depositing 200.0 to the first account");
	account = bc.getCustomerAccounts().get(2).getAccountNumber();
	bc.depositToAccount(account, 200.0);
	System.out.println(bc.toString());
	}
}