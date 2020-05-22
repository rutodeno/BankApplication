package bank;

import java.rmi.RemoteException;

public interface Bank_Features {
	public void deposit(double value);
	public void checkBalance();
	public void withdraw(double value) throws RemoteException, InsufficientFundsException;
}
