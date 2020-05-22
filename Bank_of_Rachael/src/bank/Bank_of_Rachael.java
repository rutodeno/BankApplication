package bank;

import java.rmi.RemoteException;

public class Bank_of_Rachael implements Bank_Features {
	private String name;
	private String password;
	private double amount;
	
	public Bank_of_Rachael(String name) {
		this.name = name;
	}
	
	public void withdraw(double value) throws RemoteException, 
	InsufficientFundsException {
		 			
	}
	
	public void deposit(double value) {
		amount = value + amount;
		System.out.println("Amount deposited !!");
		checkBalance();
	}
	
	public void checkBalance() {
		System.out.println("Your current balance is: $"+amount);
	}
}
