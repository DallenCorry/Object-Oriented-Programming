/**
 * The Savings Account class makes an Account that cannot be overdrawn.
 * @author Dallen Corry
 * @version 1.0
 * @since 3 Sept. 2021
 */
public class SavingsAccount extends Account {

	/**
	 * Default constructor with values id:0 balance:0
	 */
	public SavingsAccount() {
		super(0,0);
	}

	/**
	 * constructor with parameters id and balance
	 * @param (int) id the ID of the account
	 * @param (double) balance the starting balance of the account
	 */
	public SavingsAccount(int id, double balance) {
		super(id, balance);
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * this method withdraws a specified amount of money from the account. It will not withdraw if there is not enough money in the account.
	 * @param amount (double) amount of money to be withdrawn from the account
	 */
	public void withdraw(double amount){
		if(getBalance()>=amount) {
			setBalance(getBalance()-amount);
			//this extra math is to avoid rounding issues with the double type.
			double temp = Math.round(getBalance()*100);
			setBalance(temp/100);
		}else
			System.out.println("ERROR-insufficient funds");
	}
	
	/**
	 * Converts the account information into a readable string
	 * @return the account information as a string
	 */
	public String toString() {
		return "Savings "+super.toString();
		//return"";//default value
	}

}
