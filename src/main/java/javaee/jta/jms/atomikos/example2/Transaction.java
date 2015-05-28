package javaee.jta.jms.atomikos.example2;

import java.io.Serializable;

public interface Transaction {
	public void setWithdrawal(Account account);
	public void setDeposit(Account account);
	public void transfer(int amount);
	public void transferWithError(int amount);
}
